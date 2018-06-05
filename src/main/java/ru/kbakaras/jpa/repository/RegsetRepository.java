package ru.kbakaras.jpa.repository;

import org.butu.sugar.entity.IReg;
import ru.kbakaras.jpa.Regset;

public interface RegsetRepository<R extends IReg> {
    void save(Regset<R> regset);
    void save(Regset<R> regset, int portion);
}