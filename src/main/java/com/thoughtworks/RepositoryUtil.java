package com.thoughtworks;

import java.util.ArrayList;


public class RepositoryUtil {

    //变为增加for循环
    public static void printList(ArrayList<?> list) {
        for (Object obj : list) {
            System.out.println(obj.toString());
        }

//        Iterator<?> it = list.iterator();
//        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj.toString());
//        }
    }
}
