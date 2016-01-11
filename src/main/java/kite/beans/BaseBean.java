package kite.beans;

import org.hibernate.annotations.Index;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by adrianyacub on 1/10/16.
 */
@MappedSuperclass
public class BaseBean {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate = new Date();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @PreUpdate
    public void onUpdate() {
        if (creationDate == null) {
            setCreationDate(new Date());
        }
        setModifiedDate(new Date());
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "(" + getId() + ")";
    }

}

