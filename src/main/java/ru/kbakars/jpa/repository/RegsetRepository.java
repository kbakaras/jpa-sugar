package ru.kbakars.jpa.repository;

import org.butu.sugar.entity.IReg;
import ru.kbakars.jpa.RegsetSmart;

public interface RegsetRepository<R extends IReg> {
    void save(RegsetSmart<R> regset);
    void save(RegsetSmart<R> regset, int portion);
}