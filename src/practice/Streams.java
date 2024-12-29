package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,6,7,3);
        List<Integer> l1 = list.stream().filter(x-> x%2==0).toList();
        System.out.println(l1);  //[2, 4, 6]

        //map()
        List<Integer> l2 = list.stream().map(x->x*x).toList();
        System.out.println(l2);  //[4, 9, 16, 36, 49, 9]

        Stream<Integer> l3 = list.stream().map(x->x*x);
        System.out.println(l3.toList()); //[4, 9, 16, 36, 49, 9]

       // System.out.println(l3.toList());  //throws error stream already operated or closed.

        //flatMap()
        List<List<Integer>> l4 = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));

        List<Integer> flattenList = l4.stream().flatMap(x-> x.stream().map(y-> y*(x.size()))).toList();
        System.out.println(flattenList);  //[3, 6, 9, 12, 15, 18, 21, 24, 27]


        //sorted
        System.out.println(list.stream().sorted().collect(Collectors.toList()));  //[2, 3, 3, 4, 6, 7]

        //distinct() & mapToInt()

        int[] arr= list.stream().distinct().mapToInt(x-> x*x).sorted().toArray();
        System.out.println(Arrays.toString(arr));  //[4, 9, 16, 36, 49]

        //Limit()
        List<Integer> limitList= list.stream().limit(3).toList();
        System.out.println(limitList); //[2, 3, 4]

        //skip()
        List<Integer> skipiLimit= list.stream().skip(3).toList();
        System.out.println(skipiLimit);  //[6, 7, 3]

        //peeK()
        List<Integer> peekList= list.stream().peek(x-> System.out.print(x + " ")).collect(Collectors.toList());
        System.out.println(peekList);  //2 3 4 6 7 3 [2, 3, 4, 6, 7, 3]

        //reduce() - terminal ops
        Optional<Integer> reducedVal = list.stream().reduce((a, b)-> a*b);
        System.out.println(reducedVal.get());  //3024

        //min
        Integer minimum = list.stream().min((Integer val1 , Integer val2)-> val1- val2).get();
        System.out.println(minimum);  //2

        //max
        Integer maximum = list.stream().min((Integer val1 , Integer val2)-> val2- val1).get();
        System.out.println(maximum); //7


        //count
        long totalCount = list.stream().filter(x-> x%2==0).count();
        System.out.println(totalCount); //3
    }
}
