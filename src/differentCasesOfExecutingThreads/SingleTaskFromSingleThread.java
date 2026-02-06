package differentCasesOfExecutingThreads;

public class SingleTaskFromSingleThread extends Thread{

    @Override
    public void run() {
        System.out.println("Performing single task from single thread.");
    }

    public static void main(String[] args) {

        SingleTaskFromSingleThread thread = new SingleTaskFromSingleThread();
        thread.start();
    }
}
