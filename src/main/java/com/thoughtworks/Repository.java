package com.thoughtworks;

import java.util.ArrayList;

public interface Repository<I, E> {
    void save(I i, E entity);

    E getId(I id);

    void delete(I id);

    void update(I id, E entity);

    ArrayList<E> list();
}
