package interruptMethods;

public class Test extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Thread interrupted....!");
            }
        }
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.start();
        test.interrupt();
    }
}
