package ru.kbakars.jpa.repository;

import org.butu.sugar.entity.IReg;
import ru.kbakars.jpa.Regset;

public interface RegsetRepository<R extends IReg> {
    void save(Regset<R> regset);
    void save(Regset<R> regset, int portion);
}