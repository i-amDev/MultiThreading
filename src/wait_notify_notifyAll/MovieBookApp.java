package wait_notify_notifyAll;

class TotalEarnings extends Thread{

    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }
}
public class MovieBookApp{

    public static void main(String[] args) {

        TotalEarnings earnings = new TotalEarnings();
        earnings.start();

//        System.out.println(earnings.total);

        synchronized (earnings) {
            try {
                earnings.wait();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Total earning is : " + earnings.total + " Rs");
        }
    }
}
