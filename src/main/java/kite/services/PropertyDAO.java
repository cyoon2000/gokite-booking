package kite.services;

import kite.beans.Photo;
import kite.beans.Property;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PropertyDAO extends BaseDAO<Property> {

    public PropertyDAO() {
        super(Property.class);
    }
}
