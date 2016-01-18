package kite.beans;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="property")
public class Property extends BaseBean {
    @Column(length = 255, nullable = false)
    String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    PropertyType propertyType;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="parentProperty")
    Property parentProperty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Property getParentProperty() {
        return parentProperty;
    }

    public void setParentProperty(Property parentProperty) {
        this.parentProperty = parentProperty;
    }
}
