package com.mycompany.task2;
import java.util.*;

public class Main {

    public static void main(String[] args){

        int N = 10000;
        int index = N / 2;

        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();
        System.out.println("Add in ArrayList: " + (TestClass.getAddTime(list1, N)));
        System.out.println("Add in LinkedList: " + (TestClass.getAddTime(list2, N)) + "\n");
        System.out.println("Insert in ArrayList: " + (TestClass.getInsertTime(list1, index)));
        System.out.println("Insert in LinkedList: " + (TestClass.getInsertTime(list2, index)) + "\n");
        System.out.println("Removal from ArrayList: " + (TestClass.getRemoveTime(list1, index)));
        System.out.println("Removal from LinkedList: " + (TestClass.getRemoveTime(list2, index)) + "\n");
        System.out.println("Search in ArrayList: " + (TestClass.getSearchTime(list1)));
        System.out.println("Search in LinkedList: " + (TestClass.getSearchTime(list2)) + "\n");


        HashSet<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        TreeSet<String> set3 = new TreeSet<>();
        System.out.println("Add in HashSet: " + (TestClass.getAddTime(set1, N)));
        System.out.println("Add in LinkedHashSet: " + (TestClass.getAddTime(set2, N)));
        System.out.println("Add in TreeSet: " + (TestClass.getAddTime(set3, N)) + "\n");
        System.out.println("Search in HashSet: " + (TestClass.getSearchTime(set1)));
        System.out.println("Search in LinkedHashSet: " + (TestClass.getSearchTime(set2)));
        System.out.println("Search in TreeSet: " + (TestClass.getSearchTime(set3)) + "\n");
        System.out.println("Removal from HashSet: " + (TestClass.getRemoveTime(set1)));
        System.out.println("Removal from LinkedHashSet: " + (TestClass.getRemoveTime(set2)));
        System.out.println("Removal from TreeSet: " + (TestClass.getRemoveTime(set3)) + "\n");


        HashMap<Integer, String> map1 = new HashMap<>();
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
        System.out.println("Add in HashMap: " + (TestClass.getAddTime(map1, N)));
        System.out.println("Add in LinkedHashMap: " + (TestClass.getAddTime(map1, N)));
        System.out.println("Add in TreeMap: " + (TestClass.getAddTime(map1, N)) + "\n");
        System.out.println("Search in HashMap: " + (TestClass.getSearchTime(map1, index)));
        System.out.println("Search in LinkedHashMap: " + (TestClass.getSearchTime(map2, index)));
        System.out.println("Search in TreeMap: " + (TestClass.getSearchTime(map3, index)) + "\n");
        System.out.println("Removal from HashMap: " + (TestClass.getRemoveTime(map1,index )));
        System.out.println("Removal from LinkedHashMap: " + (TestClass.getRemoveTime(map2, index)));
        System.out.println("Removal from TreeMap: " + (TestClass.getRemoveTime(map3, index)) + "\n");

    }
}
