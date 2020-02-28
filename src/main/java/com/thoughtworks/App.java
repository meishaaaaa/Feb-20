package com.thoughtworks;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Student zhangS = new Student("3", "张三");
        Student liS = new Student("4", "李四");
        Student wangW = new Student("5", "王五");
        Student zhaoL = new Student("6", "赵六");
        Student qianQ = new Student("7", "钱七");

        MemoryRepository<String, Student> repository = new MemoryRepository();
        repository.save(zhangS.getId(),zhangS);
        repository.save(liS.getId(),liS);
        repository.save(wangW.getId(),wangW);
        repository.save(zhaoL.getId(),zhaoL);
        repository.save(qianQ.getId(),qianQ);

        System.out.println(repository.getId("3").toString());

        System.out.println("==============");

        repository.delete("4");

        Student fengW=new Student("5","冯五");
        repository.update(fengW.getId(),fengW);

        RepositoryUtil.printList(repository.list());

    }
}
