package com.thoughtworks;


import java.util.*;

//更改：MemoryRepository 仍然是泛型
public class MemoryRepository <String, E> implements Repository<String, E>  {
    //定义和使用的时候用接口 Map
    private Map<String, E> stuList;


    //增加newHashMap
    public MemoryRepository() {
        this.stuList = new LinkedHashMap<>();
    }

    @Override
    public void save(String string, E e) {
        stuList.put(string, e);
    }

    @Override
    public E getId(String string) {
        return stuList.get(string);
    }

    @Override
    public void delete(String id) {
        stuList.remove(id);
    }


    @Override
    //原来是put，可以不用再多一次判断
    public void update(String string, E e) {
        stuList.replace(string, e);
    }

    @Override
    public ArrayList<E> list() {
        ArrayList<E> list = new ArrayList<>();
        Set<String> set = stuList.keySet();


        for (String string : set) {
            E e = stuList.get(string);
            list.add(e);
        }

        return list;
    }

}

