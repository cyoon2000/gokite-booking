package kite.dao;

import kite.beans.Property;
import kite.dtos.SearchDTO;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PropertyDAO extends BaseDAO<Property> {

    public PropertyDAO() {
        super(Property.class);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Property> search(SearchDTO dto) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Property.class);
//        if (dto.getStartDateDay() != null && dto.getStartDateMonth() != null) {
//            Date startDate =
//        }
        return (List<Property>) criteria.list();

    }
}
