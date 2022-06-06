// Implement Queue Using Array

public class ArrayQueue<E> implements Queue<E> {
        private static final int CAPACITY = 1000;
        private int f = 0;
        private int size = 0;
        private E[] data;
    
        public ArrayQueue() {
            this(CAPACITY);
        }
        
        public ArrayQueue(int capacity) {
            data = (E[]) new Object[capacity];
        }
        
 
    
    @Override
    public void enqueue(E e) throws IllegalStateException {
        if(size() == data.length){
            throw new IllegalStateException("Queue is full");
        }
        int available = (f + size) % data.length;
        data[available] = e;
        size++;     
    }

    @Override
    public E dequeue() {
        if(size == 0) {
            return null;
        }
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        size--;
        return answer;
    }

    @Override
    public E first() {
        if(isEmpty()) {
            return null;
        }
        return data[f];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    
}
