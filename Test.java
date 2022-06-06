public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedQueue<>();
        for(Integer i = 1; i < 5; i++) {
            queue.enqueue(i);
        }
        for(Integer i = 1; i < 5; i++) {
            System.out.print(queue.dequeue() + " ");
        }
       
    }
}
