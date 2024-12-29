package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1,4);
        list.set(0,6);     //replace
        Object[] arr = list.toArray();
        System.out.print(Arrays.toString(arr));
        System.out.print(list.subList(0,2));

        ListIterator<Integer> l1 = list.listIterator();
        while(l1.hasNext()){
            int element = l1.next();
            System.out.print(element+ " ");
            if(element == 4){
                l1.remove();                    //[6, 4, 2, 3] -> [6,2,3]
                l1.add(10);                    //[6, 2, 3] -> [6, 10, 2, 3]
            }
        }
        System.out.println(list);

        //reverse iterate
        ListIterator<Integer> l2 = list.listIterator(list.size());
        while(l2.hasPrevious()){
            int element = l2.previous();
            System.out.print(element+ " ");
            if(element == 10){
                l2.remove();       // 10 will remove from the list
            }
        }
        System.out.println(list);
    }
}
