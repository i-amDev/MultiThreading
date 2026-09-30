package sleepMethod;

public class Sleep extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Sleep thread = new Sleep();
        thread.start();
    }
}
