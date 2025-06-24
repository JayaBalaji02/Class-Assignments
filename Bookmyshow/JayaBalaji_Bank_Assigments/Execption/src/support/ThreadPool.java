package support;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) {
        int poolSize=3;
        ExecutorService executorService= Executors.newFixedThreadPool(poolSize);

        for(int i=0;i<10;i++){
            int taskId=i;
            executorService.submit(()->{
                System.out.println(taskId +"task id "+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(taskId+"       completed   ");
            });

        }
        executorService.shutdown();



        System.out.println("All tasks finished.");
    }
}
