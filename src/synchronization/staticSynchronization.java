package synchronization;

class BookTheatreSeat {
    private static int totalSeats = 20;

    public static synchronized void bookSeats(int seats) {
        if (seats <= totalSeats) {
            System.out.println(seats + " seats booked successfully");
            totalSeats -= seats;
            System.out.println(totalSeats + " seats remaining");
        }
        else {
            System.out.println(seats + " seats can't be booked");
            System.out.println("Available seats : " + totalSeats);
        }

    }
}

class MyThread1 extends Thread {
    BookTheatreSeat bookTheatreSeat;
    int seats;

    public MyThread1(BookTheatreSeat bookTheatreSeat, int seats) {
        this.bookTheatreSeat = bookTheatreSeat;
        this.seats = seats;
    }

    @Override
    public void run() {
        bookTheatreSeat.bookSeats(seats);
    }
}

class MyThread2 extends Thread {
    BookTheatreSeat bookTheatreSeat;
    int seats;

    public MyThread2(BookTheatreSeat bookTheatreSeat, int seats) {
        this.bookTheatreSeat = bookTheatreSeat;
        this.seats = seats;
    }

    @Override
    public void run() {
        bookTheatreSeat.bookSeats(seats);
    }
}

public class staticSynchronization {

    public static void main(String[] args) {

        BookTheatreSeat bookTheatreSeat = new BookTheatreSeat();

        MyThread1 thread1 = new MyThread1(bookTheatreSeat, 3);
        thread1.start();

        MyThread1 thread2 = new MyThread1(bookTheatreSeat, 9);
        thread2.start();

        BookTheatreSeat obj = new BookTheatreSeat();

        MyThread1 thread3 = new MyThread1(obj, 8);
        thread3.start();

        MyThread1 thread4 = new MyThread1(obj, 4);
        thread4.start();
    }
}
