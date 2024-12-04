package data.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements Iterator<T> {

    private Node<T> head;
    private Node<T> tail;
    private Node<T> currentHead;
    private Node<T> currentTail;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Queue() {
        head = null;
        tail = null;
        currentHead = null;
        currentTail = null;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        currentHead = head;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        tail = tail.next;
        currentTail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = head.data;
        head = head.next;
        return item;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public Node<T> getCurrentHead() {
        return currentHead;
    }

    public Node<T> getCurrentTail() {
        return currentTail;
    }
}
