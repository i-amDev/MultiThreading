package interruptMethods;

public class Interrupt extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupt method called...." + e);
        }
    }

    public static void main(String[] args) {

        Interrupt thread = new Interrupt();
        thread.start();
        thread.interrupt();

    }
}
