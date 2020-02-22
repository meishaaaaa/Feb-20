package com.thoughtworks;

import java.util.LinkedHashMap;

public class App {

    public static void main(String[] args) {
        Student zhangS = new Student("3", "张三");
        Student liS = new Student("4", "李四");
        Student wangW = new Student("5", "王五");
        Student zhaoL = new Student("6", "赵六");
        Student qianQ = new Student("7", "钱七");

        LinkedHashMap<String, Student> stuList = new LinkedHashMap<>();
        MemoryRepository repository = new MemoryRepository(stuList);
        repository.save(zhangS);
        repository.save(liS);
        repository.save(wangW);
        repository.save(zhaoL);
        repository.save(qianQ);

        System.out.println(repository.getId("3").toString());

        System.out.println("==============");

        repository.delete("4");

        Student fengW=new Student("5","冯五");
        repository.update("5",fengW);

        RepositoryUtil.printList(repository.list());

    }
}
