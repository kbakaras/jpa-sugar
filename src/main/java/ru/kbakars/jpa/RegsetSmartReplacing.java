package ru.kbakars.jpa;

import org.butu.sugar.entity.IReg;

import java.util.Collection;

/**
 * Упрощённый вариант набора записей регистра, позволяющий реализовать
 * только замену значений, но не сложение.
 * @author kbakaras
 */
public abstract class RegsetSmartReplacing<E extends IReg> extends RegsetSmart<E> {
    private static final long serialVersionUID = 1L;

    public RegsetSmartReplacing() {}
    public RegsetSmartReplacing(Collection<E> list) {
        super(list);
    }

    final protected boolean addValue(E found, E item) {
        replaceValue(found, item);
        return true;
    }
}