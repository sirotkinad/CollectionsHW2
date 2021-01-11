package com.mycompany.task1;

import java.util.LinkedList;
import java.util.Random;



public class MainClass {
    public static void main(String[] args){
       /* MyLinkedList<String> countries = new MyLinkedList<String>();
        countries.add("Russia");
        countries.add("Italy");
        countries.add("USA");
        countries.add("Spain");
        countries.add("Ukraine");
        countries.add("Austria");
        countries.add("Turkey");
        countries.add(6, "Latvia");
        System.out.println(countries.size());
        System.out.println(countries.toString());
        System.out.println(countries.get(0));
        System.out.println(countries.get(3));
        System.out.println(countries.get(6));
        System.out.println(countries.indexOf("Russia"));
        countries.remove(3);
        countries.set(5, "Greece");
        System.out.println(countries.size());
        System.out.println(countries.toString());*/

        // comparison executing time with LinkedList
        System.out.println("Comparison executing time(in nanoseconds) with Java realization" + "\n");
        Random rand = new Random();
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long addStartTime = System.nanoTime();
        for(int i = 0; i < 100000; i++)
            myList.add(rand.nextInt());
        long addEndTime = System.nanoTime();
        long addStartTime2 = System.nanoTime();
        for(int i = 0; i < 100000; i++)
            list.add(rand.nextInt());
        long addEndTime2 = System.nanoTime();
        System.out.println("Add in MyLinkedList: " + (addEndTime - addStartTime));
        System.out.println("Add in LinkedList: " + (addEndTime2 - addStartTime2));
        System.out.println("\n");

        long traverseStartTime = System.nanoTime();
        myList.get(5000);
        long traverseEndTime = System.nanoTime();
        long  traverseStartTime2 = System.nanoTime();
        list.get(5000);
        long traverseEndTime2 = System.nanoTime();
        System.out.println("Passing through MyLinkedList: " + (traverseEndTime - traverseStartTime));
        System.out.println("Passing through LinkedList: " + (traverseEndTime2 - traverseStartTime2));
        System.out.println("\n");

        long removeStartTime = System.nanoTime();
        myList.remove(5000);
        long removeFinishTime = System.nanoTime();
        long removeStartTime2 = System.nanoTime();
        list.remove(5000);
        long removeFinishTime2 = System.nanoTime();
        System.out.println("Removal in MyLinkedList: " + (removeFinishTime - removeStartTime));
        System.out.println("Removal in LinkedList: " + (removeFinishTime2 - removeStartTime2));
        System.out.println("\n");

        long insertStartTime = System.nanoTime();
        myList.add(7400, 100);
        long insertFinishTime = System.nanoTime();
        long insertStartTime2 = System.nanoTime();
        list.add(7400, 100);
        long insertFinishTime2 = System.nanoTime();
        System.out.println("Inserting in MyLinkedList: " + (insertFinishTime - insertStartTime));
        System.out.println("Inserting in LinkedList: " + (insertFinishTime2 - insertStartTime2));
    }
}
