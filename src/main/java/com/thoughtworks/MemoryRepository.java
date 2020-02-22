package com.thoughtworks;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MemoryRepository implements Repository<String, Student> {
    private LinkedHashMap<String, Student> stuList = null;

    public MemoryRepository() {
    }

    public MemoryRepository(LinkedHashMap<String, Student> stuList) {
        this.stuList = stuList;
    }

    @Override
    public void save(Student student) {
        stuList.put(student.getId(), student);
    }

    @Override
    public Student getId(String id) {
        Student stu = stuList.get(id);
        return stu;
    }

    @Override
    public void delete(String id) {
        stuList.remove(id);
    }

    @Override
    public void update(String id, Student newStudent) {
        stuList.put(id, newStudent);
    }

    @Override
    public ArrayList<Student> list() {
        ArrayList<Student> list = new ArrayList<>();
        Set<String> set = stuList.keySet();
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String id = it.next();
            Student stu = stuList.get(id);
            list.add(stu);
        }
        return list;
    }


}

