package practice;

import java.util.concurrent.*;

public class ThreadPoolExecutorFile {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
                5,
                10,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(10),
                new customThreadFactor(),
                new customRejectHandler());

        threadPoolExecutor.allowCoreThreadTimeOut(true);
        for(int i=0;i<20;i++){
            threadPoolExecutor.execute(() -> {
                try{
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName());
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            });
        }

        threadPoolExecutor.shutdown();
    }
}

class customRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Thread is not accepted in pool " + r.toString());
    }
}

class
 customThreadFactor implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
