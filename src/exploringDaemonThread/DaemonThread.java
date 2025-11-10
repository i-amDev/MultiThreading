package exploringDaemonThread;

public class DaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Daemon Thread...");
    }

    public static void main(String[] args) {

        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
