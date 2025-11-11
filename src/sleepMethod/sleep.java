package sleepMethod;

public class sleep {

    public static void main(String[] args) {

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
}
