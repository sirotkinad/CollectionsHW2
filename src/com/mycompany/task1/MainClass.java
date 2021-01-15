package com.mycompany.task1;

import java.util.*;
import java.util.Random;

public class MainClass {

    public static String genRandomString(){
        final int STRING_LENGTH = 4;
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(STRING_LENGTH);
        for(int i = 0 ; i < STRING_LENGTH; i++){
            int randomInt = random.nextInt(characters.length());
            sb.append(characters.charAt(randomInt));
        }
        return sb.toString();
    }

    public static long getAddTime(LinkedList<String> list, int N){
        long StartTime = System.nanoTime();
        for(int i = 0; i < N; i++){
            list.add(genRandomString());
        }
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }


    public static long getAddTime(MyLinkedList<String> list, int N){
        long StartTime = System.nanoTime();
        for(int i = 0; i < N; i++){
            list.add(genRandomString());
        }
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getElemByIndexTime(List<String> list, int index){
        long StartTime = System.nanoTime();
        list.get(index);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getElemByIndexTime(MyLinkedList<String> list, int index){
        long StartTime = System.nanoTime();
        list.get(index);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getRemoveTime(LinkedList<String> list, int index){
        long StartTime = System.nanoTime();
        list.remove(index);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getRemoveTime(MyLinkedList<String> list, int index){
        long StartTime = System.nanoTime();
        list.remove(index);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getInsertTime(LinkedList<String> list, int index){
        long StartTime = System.nanoTime();
        list.add(index, genRandomString());
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getInsertTime(MyLinkedList<String> list, int index){
        long StartTime = System.nanoTime();
        list.add(index, genRandomString());
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static void main(String[] args){

        //test MyLinkedList
        MyLinkedList<String> countries = new MyLinkedList<>();
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
        for(String s: countries)                //for each
            System.out.println(s);
        String[] arr = new String[7];
        System.out.println(Arrays.toString(countries.toArray(arr)));


        // comparison of executing time, MyLinkedList vs LinkedList
        MyLinkedList<String> myList = new MyLinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        int N = 500;
        int index = N / 2;
        System.out.println("Comparison executing time(in nanoseconds) with Java realization" + "\n");
        System.out.println("Add in MyLinkedList: " + getAddTime(myList, N));
        System.out.println("Add in LinkedList: " + getAddTime(list, N) + "\n");
        System.out.println("Access by index in MyLinkedList: " + getElemByIndexTime(myList, index));
        System.out.println("Access by index in LinkedList: " + getElemByIndexTime(list, index) + "\n");
        System.out.println("Removal from MyLinkedList: " + getRemoveTime(myList, index));
        System.out.println("Removal from LinkedList: " + getRemoveTime(list, index) + "\n");
        System.out.println("Inserting in MyLinkedList: " + getInsertTime(myList, index));
        System.out.println("Inserting in LinkedList: " + getInsertTime(list, index) + "\n");
    }
}
