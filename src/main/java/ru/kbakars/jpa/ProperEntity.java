package ru.kbakars.jpa;

import java.util.UUID;

/**
 * Базовый класс для (правильных) сущностей. Типизирует BaseClass значением
 * параметра UUID. То есть ключом для сущности будет являться UUID.
 * Имеется конструктор без параметров, который присваивает id новой случайное
 * UUID-значение.
 */
public abstract class ProperEntity extends BaseEntity<UUID> {
    public ProperEntity() {
        this.id = UUID.randomUUID();
    }
}