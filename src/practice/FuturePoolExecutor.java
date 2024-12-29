package practice;

import java.lang.Exception;
import java.util.concurrent.*;

public class FuturePoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                1,
                1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> future = threadPoolExecutor.submit(() -> {
            try{
                Thread.sleep(7000);
                System.out.println("this is  the task");
            }catch (Exception e){}
        });
        System.out.println(future.isDone());
        try{
            future.get(2, TimeUnit.SECONDS);
        }catch (Exception e){}

        try{
            future.get();
        }catch(Exception e){};

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
    }
}
