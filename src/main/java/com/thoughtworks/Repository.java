package com.thoughtworks;

import java.util.ArrayList;

public interface Repository<String, E> {
    void save(String i, E entity);

    E getId(String id);

    void delete(String id);

    void update(String id, E entity);

    ArrayList<E> list();
}
