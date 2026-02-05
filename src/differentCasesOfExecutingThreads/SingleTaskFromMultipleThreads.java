package differentCasesOfExecutingThreads;

public class SingleTaskFromMultipleThreads extends Thread{

    @Override
    public void run() {
        System.out.println("Performing single task from multiple thread.");
    }

    public static void main(String[] args) {

        SingleTaskFromMultipleThreads thread = new SingleTaskFromMultipleThreads();
        thread.start();

        SingleTaskFromMultipleThreads newThread = new SingleTaskFromMultipleThreads();
        newThread.start();

    }
}
