package com.mycompany.task1;

import java.util.Arrays;
import java.util.Iterator;


public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {

    }

    @Override
    public void add(E element) {
        if (size == 0) {
            first = new Node<>(element);
            last = first;
            size = 1;
        }
        else {
            Node<E> node = new Node<>(element);
            last.setNextNode(node);
            last = node;
            size++;
        }
    }

    @Override
    public void add(int index, E element) {
        if (!(index >= 0 && index <= size)) {
            throw new IndexOutOfBoundsException("Illegal index");
        }
        else if ((index == 0 && size == 0) || index == size) {
            add(element);
        }
        else if (index == 0 && size > 0) {
            first = new Node<>(element, first);
            size++;
        }
        else {
            Node<E> temp = first;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNextNode();
            }
            Node<E> elem = new Node<>(element, temp.getNextNode());
            temp.setNextNode(elem);
            size++;
        }
    }

    @Override
    public void clear() {
        for(Node<E> temp = first; temp != null; ) {
            Node<E> next = temp.getNextNode();
            temp.setElement(null);
            temp.setNextNode(null);
            temp = next;
        }
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public E get(int index) {
        if (!(isCorrectIndex(index)))
            throw new IndexOutOfBoundsException("Illegal index");
        int curIndex = 0;
        Node<E> temp = first;
        while(curIndex != index){
            temp = temp.getNextNode();
            curIndex ++;
        }
        return temp.getElement();
    }

    @Override
    public int indexOf (E element){
        int curIndex = 0;
        for(Node<E> temp = first; temp != null; temp = temp.getNextNode()){
            if(temp.getElement().equals(element))
                return curIndex;
            curIndex ++;
        }
        return -1;
    }

    @Override
    public E remove ( int index){
        if (!(isCorrectIndex(index)))
            throw new IndexOutOfBoundsException("Illegal index");
        Node<E> temp = first;
        if(index == 0){
            first = temp.getNextNode();
            size --;
            return temp.getElement();
        }
        int curIndex = 0;
        while(curIndex < index - 1){
            temp = temp.getNextNode();
            curIndex ++;
        }
        E elem = temp.getNextNode().getElement();
        temp.setNextNode(temp.getNextNode().getNextNode());
        size --;
        return elem;
    }

    @Override
    public E set ( int index, E element){
        if (!(isCorrectIndex(index)))
            throw new IndexOutOfBoundsException("Illegal index");
        Node<E> temp = first;
        int curIndex = 0;
        while(curIndex != index){
            temp = temp.getNextNode();
            curIndex ++;
        }
        E oldElement = temp.getElement();
        temp.setElement(element);
        return oldElement;
    }

    @Override
    public int size () {
        return size;
    }

    @Override
    public E[] toArray () {
        E[] resArray = (E[]) new Object[size];
        int i = 0;
        for (Node<E> temp = first; temp != null; temp = temp.getNextNode())
            resArray[i++] = temp.getElement();
        return resArray;
    }

    @Override
    public Iterator<E> iterator () {
        return new Iterator<E>() {
            private Node<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if(hasNext()){
                    E elem = current.getElement();
                    current = current.getNextNode();
                    return elem;
                }
                else throw new IndexOutOfBoundsException("Empty list");
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }

    @Override
    public String toString () {
        return Arrays.toString(this.toArray());
    }

    boolean isCorrectIndex ( int index){
        return (index >= 0 && index < size);
    }
}


