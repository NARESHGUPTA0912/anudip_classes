package labs_task.lab9;

class Movie {
    int availTicket;

    Movie(int availTicket){
        this.availTicket = availTicket;
    }

    public synchronized void bookTicket(int bookedTicket){
        System.out.println(Thread.currentThread().getName() + " checking tickets.");
        if(bookedTicket<=availTicket){
            System.out.println(bookedTicket + " Ticket Booked Successfully by " + Thread.currentThread().getName());
            availTicket -= bookedTicket;
        } else {
            System.out.println("Ticket is NOT available for " + Thread.currentThread().getName());
        }
    }

    public int getAvailTicket() {
        return availTicket;
    }
}



public class LabTask9 {
    public static void main(String[] args) {
        Movie m = new Movie(1);
        Thread customer1 = new Thread(
        () -> {
            m.bookTicket(1);
        });
        Thread customer2 = new Thread(
        () -> {
            m.bookTicket(1);
        });

        customer1.start();
        customer2.start();

        try {
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Remaining Tickets: " + m.getAvailTicket());
    }
}
