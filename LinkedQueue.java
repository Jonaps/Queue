package com.mycompany.queue;

public class LinkedQueue<E> implements Queue<E> {
    
    SinglyLinkedList<E> list = new SinglyLinkedList<>();
    
    
    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
}
