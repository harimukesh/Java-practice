package practice;
import java.util.ArrayDeque;


class Trade{

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

public class MultiThreading {
    public static void main(String[] args) {
        Trade trade = new Trade();
        Thread obj1 = new Thread(() -> trade.producer(1));
        Thread obj2 = new Thread(() -> trade.producer(2));
        Thread obj3 = new Thread(() -> trade.producer(3));
        Thread obj4 = new Thread(() -> trade.consumer());
        Thread obj5 = new Thread(() -> trade.consumer());
        Thread obj6 = new Thread(() -> trade.consumer());
        Thread obj7 = new Thread(() -> trade.consumer());
        Thread obj8 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            trade.producer(6);});

        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();
        obj7.start();
        obj8.start();

        /*  Thread obj9 = new Thread(() -> trade.producer(1));
        Thread obj10 = new Thread(() -> trade.producer(2));
        Thread obj11 = new Thread(() -> trade.producer(3));
        Thread obj111 = new Thread(() -> trade.producer(5));
        Thread obj12 = new Thread(() -> trade.consumer());
        Thread obj13 = new Thread(() -> trade.consumer());
        Thread obj14 = new Thread(() -> trade.consumer());
        Thread obj15 = new Thread(() -> trade.consumer());*/
        /*obj9.start();
        obj10.start();
        obj11.start();
        obj111.start();
        obj12.start();
        obj13.start();
        obj14.start();
        obj15.start();*/

    }
}
