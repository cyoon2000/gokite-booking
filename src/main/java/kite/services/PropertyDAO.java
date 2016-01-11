package kite.services;

import kite.beans.Property;
import org.springframework.stereotype.Repository;

@Repository
public class PropertyDAO extends BaseDAO<Property> {

    public PropertyDAO() {
        super(Property.class);
    }
}
