package yieldMethod;

public class Yield extends Thread{

    @Override
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }

    public static void main(String[] args) {

        Yield thread = new Yield();
        thread.start();

//        Thread.yield();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
