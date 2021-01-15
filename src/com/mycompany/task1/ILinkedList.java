package com.mycompany.task1;

public interface ILinkedList<E> extends Iterable<E> {


    void add(E element); //Appends the specified element to the end of this list
    void add(int index, E element); //Inserts the specified element at the specified position in this list
    void clear(); //Removes all of the elements from this list
    E get(int index); //Returns the element at the specified position in this list
    int indexOf(E element); //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    E remove(int index); //Removes the element at the specified position in this list
    E set(int index, E element); //Replaces the element at the specified position in this list with the specified element
    int size(); //Returns the number of elements in this list.
    E[] toArray(E[] arr); //Returns an array containing all of the elements in this list in proper sequence (from first to last element).
    String toString();

}
