package com.mycompany.queue;

//Interface for LinkedQueue
public interface Queue<E> {
    
    public void enqueue(E e);
    
    public E dequeue();
    
    public E first();
    
    public int size();
    
    public boolean isEmpty();
    
}
