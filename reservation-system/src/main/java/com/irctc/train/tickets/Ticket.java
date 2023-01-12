package com.irctc.train.tickets;

public class Ticket {
    int availableSeat = 100;
    public synchronized void bookTicket(int noOfPassengers) {

        for(int i = 1; i <= noOfPassengers; i++) {
            availableSeat = availableSeat - 1;
            System.out.print(Thread.currentThread().getName()+ "\t");
            System.out.println("Booked ticket for passenger: " + i );
//            System.out.println("Available Seat : " + availableSeat);
        }
    }
    public void getAvailability() {
        synchronized (this){
            System.out.println("Available seats : " + availableSeat);
        }
    }

}