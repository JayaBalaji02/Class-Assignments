import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bookmyshowthread {
    public static void main(String[] args) {

        Agscinemas ags = new Agscinemas();
        Pvrcinemas pvr = new Pvrcinemas();

        ags.start();
        pvr.start();
    }
}


class Agscinemas extends Thread {
    public void run() {
        System.out.println("started using Bookmyshow application for AGS cinemas.");
        ExecutorService service= Executors.newFixedThreadPool(2);
        try {

            Thread.sleep(1000);


            String[] movies = {"Interstealer", "A good day", "War", "purple heart"};
            for (int i = 0; i < movies.length; i++) {
                int taskId=i;
                service.submit(()->{
                    System.out.println("taskId "+ taskId + Thread.currentThread().getName()+"  currenat thread name");
                });
                System.out.println("AGS Cinemas  " + movies[i]);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Pvrcinemas extends Thread {
    public  void run() {
        System.out.println("Started using Bookmyshow application for PVR Cinemas.");

        try {

            Thread.sleep(1500);


            String[] movies = {"Fall guy", "Family Man", "Test"};
            for (String movie : movies) {
                System.out.println("PVR Cinemas  " + movie);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
