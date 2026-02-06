package exploringThreadMethods;

public class MyThread extends Thread{

    @Override
    public void run() {
        Thread.currentThread().setName("customThread");
        System.out.println("Thread task is executed by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        System.out.println("Hello is executed by thread " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(thread.isAlive());
    }
}
