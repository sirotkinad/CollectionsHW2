package com.mycompany.task2;

import java.util.*;

public class TestClass {

    public static String genRandomString(){
        Random random = new Random();
        final int STRING_LENGTH = 4;
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(STRING_LENGTH);
        for(int i = 0 ; i < STRING_LENGTH; i++){
            int randomInt = random.nextInt(characters.length());
            sb.append(characters.charAt(randomInt));
        }
        return sb.toString();
    }

    public static long getAddTime(Collection<String> c, int N){
        long StartTime = System.nanoTime();
        for (int i = 0; i < N; i++)
            c.add(genRandomString());
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getAddTime(Map<Integer, String> m, int N){
        long addStartTime1 = System.nanoTime();
        for (int i = 0; i < N; i++)
            m.put(i, genRandomString());
        long addEndTime1 = System.nanoTime();
        return addEndTime1 - addStartTime1;
    }

    public static long getInsertTime(List<String> list, int index){
        long StartTime = System.nanoTime();
        list.add(index, genRandomString());
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getRemoveTime(List<String> list, int index){
        long StartTime = System.nanoTime();
        list.remove(index);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getRemoveTime(Collection<String> c){
        long StartTime = System.nanoTime();
        c.remove(genRandomString());
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getRemoveTime(Map<Integer, String> m, int index){
        long StartTime = System.nanoTime();
        m.remove(index);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getSearchTime(Collection<String> c){
        long StartTime = System.nanoTime();
        c.contains(genRandomString());
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }

    public static long getSearchTime(Map<Integer,String> m, int key){
        long StartTime = System.nanoTime();
        m.containsKey(key);
        long EndTime = System.nanoTime();
        return EndTime - StartTime;
    }
}
