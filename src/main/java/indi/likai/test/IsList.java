package indi.likai.test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class IsList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
//        System.out.println(list instanceof  ArrayList);
//        System.out.println(list instanceof  List);


        System.out.println(list.getClass().isAssignableFrom(List.class));
        System.out.println(List.class.isAssignableFrom(list.getClass()));
    }
}
