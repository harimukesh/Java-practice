package practice;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.add(1);
        s1.push(3);
        s1.push(5);
        System.out.println(s1);
        System.out.print(s1.pop());   //stack is thread safe
    }
}
