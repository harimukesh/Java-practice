package practice;
import java.util.ArrayDeque;


class Resource{

    ArrayDeque<Integer> deque = new ArrayDeque<>();
    public static final int BUFFER_SIZE = 3;

    public synchronized  void producer(int i){
        while(deque.size()>=BUFFER_SIZE){
            try{
                System.out.println("producer wait - queue is full");
                wait();
            }catch(InterruptedException e){
                System.out.print(e);
            }
        }
        deque.offer(i);
        notifyAll();
    }

    public synchronized void consumer(){
        while(deque.isEmpty()){
            try{
                System.out.println("consumer wait - queue is empty");
                wait();
            }catch(InterruptedException e){
                System.out.print(e);
            }
        }
        System.out.println(deque.pollFirst());
        notifyAll();
    }
}

public class MultiThreadingExercise {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i < 10; i++) {
                    Thread.sleep(200); // Simulate time taken to produce an item
                    resource.producer(i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }});

        Thread consumerThread = new Thread(() -> {

            try {
                for(int i = 1; i < 10; i++){
                    Thread.sleep(500); // Simulate time taken to consume an item
                    resource.consumer();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        producerThread.start();
        consumerThread.start();

    }
}
