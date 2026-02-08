package synchronization;

class BookSeat {
    private int totalSeats = 10;

    public void bookSeats(int seats) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

        synchronized (this) {
            if (seats <= totalSeats) {
                System.out.println("Seat booked successfully");
                totalSeats -= seats;
                System.out.println(totalSeats + " seats remaining");
            }
            else {
                System.out.println("Seat can't be booked");
                System.out.println("Available seats : " + totalSeats);
            }
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

    }
}

public class MovieBookApp extends Thread{

    static BookSeat bookSeat;

    private int seats;

    @Override
    public void run() {
        bookSeat.bookSeats(seats);
    }

    public static void main(String[] args) {

        bookSeat = new BookSeat();

        MovieBookApp thread1 = new MovieBookApp();
        thread1.seats = 7;
        thread1.start();

        MovieBookApp thread2 = new MovieBookApp();
        thread2.seats = 6;
        thread2.start();

    }
}
