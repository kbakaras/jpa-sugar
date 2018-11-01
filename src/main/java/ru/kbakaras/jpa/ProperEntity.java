package ru.kbakaras.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * Базовый класс для (правильных) сущностей. Типизирует BaseClass значением
 * параметра UUID. То есть ключом для сущности будет являться UUID.
 * Имеется конструктор без параметров, который присваивает id новой случайное
 * UUID-значение.
 */
@MappedSuperclass
public abstract class ProperEntity extends BaseEntity<UUID> {
    @Id
    @GeneratedValue
    protected UUID id;

    @Override
    public UUID getId() {
        return id;
    }
    @Override
    public void setId(UUID id) {
        this.id = id;
    }
}