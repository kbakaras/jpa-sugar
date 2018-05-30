package ru.kbakars.jpa;

import org.butu.sugar.entity.IEntity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseEntity<ID> implements IEntity<ID> {
    @Id
    protected ID id;

    @Version
    protected int version;


    @Override
    public ID getId() {
        return id;
    }
    @Override
    public void setId(ID id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        } else {
            if (this.getClass().equals(obj.getClass())) {
                return this.id.equals(((BaseEntity) obj).id);
            }
            return false;
        }
    }
}