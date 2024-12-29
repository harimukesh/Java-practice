package practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Deque {
    public static void main(String[] args) {

        //Deque stands for double ended Queue - it can work as Queue and Stack
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        Scanner sc = new Scanner(System.in);
        deque.addFirst(sc.nextInt());
        deque.addFirst(sc.nextInt());
        deque.addLast(sc.nextInt());
        deque.addLast(sc.nextInt());

        deque.add(4); // Equals to addLast(), Throws a NoSuchElementException if the deque is empty.
        deque.offer(5); //Equals to offerLast, or returns null if the deque is empty
        System.out.print(deque);
        System.out.println(deque.removeFirst());  //Retrieves and removes the first element of the deque. Throws a NoSuchElementException if the deque is empty.
        System.out.println(deque.pollFirst());    //Retrieves and removes the first element of the deque, or returns null if the deque is empty.
        System.out.println(deque.removeLast());
        System.out.println(deque.peek());      // return the first element of the deque, or returns null if the deque is empty.
        System.out.println(deque.element()); //return first element ,Throws a NoSuchElementException if the deque is empty
        System.out.print(deque);
    }
}
