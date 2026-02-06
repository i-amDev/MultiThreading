package differentCasesOfExecutingThreads;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        System.out.println("Thread 2!");
    }

}
