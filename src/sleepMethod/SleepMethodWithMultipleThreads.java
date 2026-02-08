package sleepMethod;

public class SleepMethodWithMultipleThreads extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {

        SleepMethodWithMultipleThreads thread1 = new SleepMethodWithMultipleThreads();
        thread1.start();

        SleepMethodWithMultipleThreads thread2 = new SleepMethodWithMultipleThreads();
        thread2.start();
    }
}
