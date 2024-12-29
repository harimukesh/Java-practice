package practice;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
    }
}

