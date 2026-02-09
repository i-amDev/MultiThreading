public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Created a thread using Runnable interface......");
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);

        thread.start();
    }
}
