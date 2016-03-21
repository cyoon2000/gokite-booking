package kite.dao;

import kite.beans.Occupancy;
import kite.beans.Property;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class OccupancyDAO extends BaseDAO<Occupancy>{
    public OccupancyDAO() {
        super(Occupancy.class);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public void deleteForProperty(Property property) {
        String hql = "delete from Occupancy where property = :p";
        sessionFactory.getCurrentSession().createQuery(hql)
                .setEntity("p", property)
                .executeUpdate();
    }
}
