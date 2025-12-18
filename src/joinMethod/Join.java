package joinMethod;

public class Join extends Thread{

    static Thread mainThread;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                mainThread.join();
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {

        mainThread = Thread.currentThread();

        Join thread = new Join();
        thread.start();

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
