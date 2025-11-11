package joinMethod;

public class Join extends Thread{

    @Override
    public void run() {
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

    public static void main(String[] args) {

        Join thread = new Join();
        thread.start();
        try {
            thread.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
