package Question3;

import java.util.concurrent.*;
import Printer.*;
public class CachedThreadPoolTest {
    public static void main(String[] args) {

//        Using newCachedThreadPool() method
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);

        // Cast the object to its class type
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;

        //Stats before tasks execution
        Printer.print("Largest executions: " + pool.getLargestPoolSize());
        Printer.print("Maximum allowed threads: " + pool.getMaximumPoolSize());
        Printer.print("Current threads in pool: " + pool.getPoolSize());
        Printer.print("Currently executing threads: " + pool.getActiveCount());
        Printer.print("Total number of threads(ever scheduled): " + pool.getTaskCount());

        executorService.submit(new Task());
        executorService.submit(new Task());

        //Stats after tasks execution
        Printer.print("Core threads: " + pool.getCorePoolSize());
        Printer.print("Largest executions: " + pool.getLargestPoolSize());
        Printer.print("Maximum allowed threads: " + pool.getMaximumPoolSize());
        Printer.print("Current threads in pool: " + pool.getPoolSize());
        Printer.print("Currently executing threads: " + pool.getActiveCount());
        Printer.print("Total number of threads(ever scheduled): " + pool.getTaskCount());
        executorService.shutdown();
    }
}

class Task implements Runnable {
    public void run() {
        try {
            long duration = (long) (Math.random() * 5);
            Printer.print("Running Task! Thread Name: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(duration);
            Printer.print("Task Completed! Thread Name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
