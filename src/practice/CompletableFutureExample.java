package practice;

import java.lang.Exception;
import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) {
        try{
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                    1,
                    1,
                    TimeUnit.HOURS,
                    new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                System.out.println(Thread.currentThread().getName());     //pool-1-thread-1
                return "Hello";
            },threadPoolExecutor).thenApply((String val)->{
                System.out.println(Thread.currentThread().getName());   //main
                return val +" World";
            });

            future.thenAccept((String val2)-> System.out.print(val2));   //Hello World
            threadPoolExecutor.shutdown();
        }catch(Exception e){};


    }
}
