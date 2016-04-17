package kite.dao;

import kite.beans.Property;
import kite.dtos.SearchDTO;
import kite.utils.DateUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

@Repository
public class PropertyDAO extends BaseDAO<Property> {

    public PropertyDAO() {
        super(Property.class);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Property> search(SearchDTO dto) {
        // see http://stackoverflow.com/questions/325933/determine-whether-two-date-ranges-overlap

        int start = DateUtils.toDateNumber(dto.getStartDateYear(), dto.getStartDateMonth(), dto.getStartDateDay());
        int end = DateUtils.toDateNumber(dto.getEndDateYear(), dto.getEndDateMonth(), dto.getEndDateDay());
        String hql = "select p from Property p " +
                " where p.capacity >= :cap" +
                " and not exists (" +
                "  select 1 from Occupancy o" +
                "  where o.property = p " +
                "     and (o.startDateTimeInclusive <= :end and o.endDateTimeExclusive >= :start)" +
                ")";
        return sessionFactory.getCurrentSession().createQuery(hql)
                .setInteger("cap", dto.getMinCapacity())
                .setInteger("start", start)
                .setInteger("end", end)
                .list();
    }
}
