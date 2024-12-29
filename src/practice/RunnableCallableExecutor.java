package practice;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunnableCallableExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                1,
                1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //use case 1

        Future<?> futureObj1 = threadPoolExecutor.submit(()->{
           System.out.println("task1 is Running");
        });

        try{
            Object obj = futureObj1.get();
            System.out.println(obj ==null);
        }catch(Exception e){};

        //use case 2

        List<Integer> output=new ArrayList<Integer>();
        Future<List<Integer>> futureObj2 = threadPoolExecutor.submit(()->{
            output.add(1);
            System.out.println("task2 is Running");
        },output);

        try{
          List<Integer> futureResponse = futureObj2.get();
           System.out.println(futureResponse.get(0));
        }catch(Exception e){};


        //use case 3
        Future<List<Integer>> futureObj3 = threadPoolExecutor.submit(()->{
           List<Integer> list = new ArrayList<>();
           list.add(2);
            System.out.println("task3 is Running");
            return list;
        });

        try{
            List<Integer> futureResponseObj1 = futureObj3.get();
            System.out.println(futureResponseObj1.get(0));
        }catch(Exception e){};

    }
}
