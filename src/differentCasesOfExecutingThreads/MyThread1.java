package differentCasesOfExecutingThreads;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("Thread 1!");
    }
}
