package com.mycompany.task1;

public class Node<E> {

    private E element;
    private Node<E> nextNode;

    Node(){
    }

    Node(E element) {
        this.element = element;
    }

    Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    E getElement() {
        return element;
    }

    void setElement(E element) {
        this.element = element;
    }

    Node<E> getNextNode() {
        return nextNode;
    }

    void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}