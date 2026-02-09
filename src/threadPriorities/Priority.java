package threadPriorities;

public class Priority extends Thread{

    @Override
    public void run() {
        System.out.println("Child thread....Priority is " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("Main thread old priority is " + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(7);
        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("Main thread new priority is " + Thread.currentThread().getPriority());

        Priority priority = new Priority();
        priority.setPriority(9);
        priority.start();

    }
}
