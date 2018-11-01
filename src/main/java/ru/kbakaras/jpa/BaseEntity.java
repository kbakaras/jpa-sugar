package ru.kbakaras.jpa;

import ru.kbakaras.sugar.entity.IEntity;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseEntity<ID> implements IEntity<ID> {
    @Version
    protected int version;


    public int getVersion() {
        return version;
    }


    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        } else {
            if (this.getClass().equals(obj.getClass())) {
                return this.getId().equals(((BaseEntity) obj).getId());
            }
            return false;
        }
    }
}