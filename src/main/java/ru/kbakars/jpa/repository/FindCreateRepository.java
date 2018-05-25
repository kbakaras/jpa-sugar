package ru.kbakars.jpa.repository;

import org.butu.sugar.entity.IEntity;

import java.util.function.Supplier;

public interface FindCreateRepository<E extends IEntity<K>, K> {
    E findCreate(K id, Supplier<E> creator);
}