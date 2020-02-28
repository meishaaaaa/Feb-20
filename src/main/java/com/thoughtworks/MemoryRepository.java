package com.thoughtworks;


import java.util.*;

//更改：MemoryRepository 仍然是泛型
public class MemoryRepository <I, E> implements Repository<I, E>  {
    //定义和使用的时候用接口 Map
    private Map<I, E> stuList = null;


    //增加newHashMap
    public MemoryRepository() {
        this.stuList = new HashMap<>();
    }

    @Override
    public void save(I i, E e) {
        stuList.put(i, e);
    }

    @Override
    public E getId(I i) {
        return stuList.get(i);
    }

    @Override
    public void delete(I id) {
        stuList.remove(id);
    }


    @Override
    //原来是put，可以不用再多一次判断
    public void update(I i, E e) {
        stuList.replace(i, e);
    }

    @Override
    public ArrayList<E> list() {
        ArrayList<E> list = new ArrayList<>();
        Set<I> set = stuList.keySet();
        Iterator<I> it = set.iterator();

        while (it.hasNext()) {
            I i = it.next();
            E e = stuList.get(i);
            list.add(e);
        }

        return list;
    }

}

