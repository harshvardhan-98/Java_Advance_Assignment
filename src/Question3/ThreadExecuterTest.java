package Question3;
import Printer.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadExecuterTest implements Runnable{
    String name;
    ThreadExecuterTest(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            Printer.print("Hello "+name);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        ThreadExecuterTest threadTest1 = new ThreadExecuterTest("Aasif");
        Thread thread1 = new Thread(threadTest1);
        thread1.setName("Thread-1");

        ThreadExecuterTest threadTest2 = new ThreadExecuterTest("Ali");
        Thread thread2 = new Thread(threadTest2);
        thread2.setName("Thread-2");

        ThreadExecuterTest threadTest3 = new ThreadExecuterTest("Azeem");
        Thread thread3 = new Thread(threadTest3);
        thread3.setName("Thread-3");


        // Creating a fixed thread pool with maximum one thread.
        ExecutorService executor = Executors.newFixedThreadPool(3);


        thread1.start();
        //Using join method
        try {
            thread1.join(5000);
            Printer.print("Starts other threads after when first thread "+thread1.getName()+" has died. Waiting by join method.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.submit(thread2);
        executor.submit(thread3);
        Printer.print("Is shutdown :"+executor.isShutdown());
        Printer.print("Is Terminated :"+executor.isTerminated());
        for (int i =0; i<3; i++){
            Printer.print("Good Evening");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executor.submit(()->{
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("interrupted");
                    break;
                }
            }
        });


        System.out.println("***********Waiting for tasks to be complete*********");

//        Using shutdown method
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5000, TimeUnit.MILLISECONDS)) {
                Printer.print("Terminating all the tasks");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

//        Using isShutDown() method
        while (!executor.isShutdown());
        Printer.print("By shutdown() method, it can't accept new tasks");

        // Waiting for all thread to finish
        while (!executor.isTerminated());
        Printer.print("Is Terminated :"+executor.isTerminated());

    }
}
