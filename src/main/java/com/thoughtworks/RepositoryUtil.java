package com.thoughtworks;

import java.util.ArrayList;
import java.util.Iterator;


public class RepositoryUtil {
    public static void printList(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj.toString());
        }
    }
}
