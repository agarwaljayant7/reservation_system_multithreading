package com.irctc.train.threads;

import com.irctc.train.tickets.Ticket;

public class Thread2 extends  Thread{
    Ticket t = null; int noOfPassengers = 0;
    public Thread2(Ticket t, int noOfPassengers){
        this.t = t;
        this.noOfPassengers = noOfPassengers;
    }
    public void run(){

        t.bookTicket(noOfPassengers);
        t.getAvailability();
    }
}