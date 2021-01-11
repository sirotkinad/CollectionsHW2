package com.mycompany.task2;

import java.util.*;

public class TestClass {

    public static String genRandomString(Random random){
        final int STRING_LENGTH = 4;
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(STRING_LENGTH);
        for(int i = 0 ; i < STRING_LENGTH; i++){
            int randomInt = random.nextInt(characters.length());
            sb.append(characters.charAt(randomInt));
        }
        return sb.toString();
    }

    public static void compareLists(int n){

        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();
        Random random = new Random();

        //add
        long addStartTime1 = System.nanoTime();
        for(int i = 0; i < n; i++)
            list1.add(genRandomString(random));
        long addEndTime1 = System.nanoTime();
        long addStartTime2 = System.nanoTime();
        for(int i = 0; i < n; i++)
            list2.add(genRandomString(random));
        long addEndTime2 = System.nanoTime();

        //inserting
        long insertStartTime1 = System.nanoTime();
        list1.add(n / 2, genRandomString(random));
        long insertEndTime1 = System.nanoTime();
        long insertStartTime2 = System.nanoTime();
        list2.add(n / 2, genRandomString(random));
        long insertEndTime2 = System.nanoTime();

        //removal
        long removeStartTime1 = System.nanoTime();
        list1.remove(n / 2);
        long removeEndTime1 = System.nanoTime();
        long removeStartTime2 = System.nanoTime();
        list2.remove(n / 2);
        long removeEndTime2 = System.nanoTime();

        System.out.println("Add in ArrayList: " + (addEndTime1 - addStartTime1));
        System.out.println("Add in LinkedList: " + (addEndTime2 - addStartTime2) + "\n");
        System.out.println("Insert in ArrayList: " + (insertEndTime1 - insertStartTime1));
        System.out.println("Insert in LinkedList: " + (insertEndTime2 - insertStartTime2) + "\n");
        System.out.println("Removal from ArrayList: " + (removeEndTime1 - removeStartTime1));
        System.out.println("Removal from LinkedList: " + (removeEndTime2 - removeStartTime2) + "\n");
    }

    public static void compareSet(int n){

        HashSet<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        TreeSet<String> set3 = new TreeSet<>();
        Random random = new Random();

        //add
        long addStartTime1 = System.nanoTime();
        for(int i = 0; i < n; i++)
            set1.add(genRandomString(random));
        long addEndTime1 = System.nanoTime();
        long addStartTime2 = System.nanoTime();
        for(int i = 0; i < n; i++)
            set2.add(genRandomString(random));
        long addEndTime2 = System.nanoTime();
        long addStartTime3 = System.nanoTime();
        for(int i = 0; i < n; i++)
            set3.add(genRandomString(random));
        long addEndTime3 = System.nanoTime();

        //removal
        long removeStartTime1 = System.nanoTime();
        set1.remove(genRandomString(random));
        long removeEndTime1 = System.nanoTime();
        long removeStartTime2 = System.nanoTime();
        set2.remove(genRandomString(random));
        long removeEndTime2 = System.nanoTime();
        long removeStartTime3 = System.nanoTime();
        set3.remove(genRandomString(random));
        long removeEndTime3 = System.nanoTime();

        //search
        long searchStartTime1 = System.nanoTime();
        set1.contains(genRandomString(random));
        long searchEndTime1 = System.nanoTime();
        long searchStartTime2 = System.nanoTime();
        set2.contains(genRandomString(random));
        long searchEndTime2 = System.nanoTime();
        long searchStartTime3 = System.nanoTime();
        set3.contains(genRandomString(random));
        long searchEndTime3 = System.nanoTime();

        System.out.println("Add in HashSet: " + (addEndTime1 - addStartTime1));
        System.out.println("Add in LinkedHashSet: " + (addEndTime2 - addStartTime2));
        System.out.println("Add in TreeSet: " + (addEndTime3 - addStartTime3) + "\n");
        System.out.println("Search in HashSet: " + (searchEndTime1 - searchStartTime1));
        System.out.println("Search in LinkedHashSet: " + (searchEndTime2 - searchStartTime2));
        System.out.println("Search in TreeSet: " + (searchEndTime3 - searchStartTime3) + "\n");
        System.out.println("Removal from HashSet: " + (removeEndTime1 - removeStartTime1));
        System.out.println("Removal from LinkedHashSet: " + (removeEndTime2 - removeStartTime2));
        System.out.println("Removal from TreeSet: " + (removeEndTime3 - removeStartTime3) + "\n");
    }

    public static void compareMap(int n){
        HashMap<Integer, String> map1 = new HashMap<>();
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
        Random random = new Random();

        //add
        long addStartTime1 = System.nanoTime();
        for(int i = 0; i < n; i++)
            map1.put(i, genRandomString(random));
        long addEndTime1 = System.nanoTime();
        long addStartTime2 = System.nanoTime();
        for(int i = 0; i < n; i++)
            map2.put(i, genRandomString(random));
        long addEndTime2 = System.nanoTime();
        long addStartTime3 = System.nanoTime();
        for(int i = 0; i < n; i++)
            map3.put(i, genRandomString(random));
        long addEndTime3 = System.nanoTime();

        //removal
        long removeStartTime1 = System.nanoTime();
        map1.remove(n / 2);
        long removeEndTime1 = System.nanoTime();
        long removeStartTime2 = System.nanoTime();
        map2.remove(n / 2);
        long removeEndTime2 = System.nanoTime();
        long removeStartTime3 = System.nanoTime();
        map3.remove(n / 2);
        long removeEndTime3 = System.nanoTime();

        //search
        long searchStartTime1 = System.nanoTime();
        map1.containsKey(n / 2);
        long searchEndTime1 = System.nanoTime();
        long searchStartTime2 = System.nanoTime();
        map2.containsKey(n / 2);
        long searchEndTime2 = System.nanoTime();
        long searchStartTime3 = System.nanoTime();
        map3.containsKey(n / 2);
        long searchEndTime3 = System.nanoTime();

        System.out.println("Add in HashMap: " + (addEndTime1 - addStartTime1));
        System.out.println("Add in LinkedHashMap: " + (addEndTime2 - addStartTime2));
        System.out.println("Add in TreeMap: " + (addEndTime3 - addStartTime3) + "\n");
        System.out.println("Search in HashMap: " + (searchEndTime1 - searchStartTime1));
        System.out.println("Search in LinkedHashMap: " + (searchEndTime2 - searchStartTime2));
        System.out.println("Search in TreeMap: " + (searchEndTime3 - searchStartTime3) + "\n");
        System.out.println("Removal from HashMap: " + (removeEndTime1 - removeStartTime1));
        System.out.println("Removal from LinkedHashMap: " + (removeEndTime2 - removeStartTime2));
        System.out.println("Removal from TreeMap: " + (removeEndTime3 - removeStartTime3) + "\n");
    }
}
