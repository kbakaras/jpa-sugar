package ru.kbakars.jpa.repository;

import org.butu.sugar.entity.IEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.function.Supplier;

public abstract class FindCreateRepositoryImpl<E extends IEntity<K>, K> implements FindCreateRepository<E, K> {
    @PersistenceContext
    private EntityManager em;

    @Override
    public E findCreate(K id, Supplier<E> creator) {
        E element = em.find(clazz(), id);
        if (element == null) {
            element = creator.get();
        }
        return element;
    }

    protected abstract Class<E> clazz();
}