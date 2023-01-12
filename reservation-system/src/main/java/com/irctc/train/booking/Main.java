package com.irctc.train.booking;

import com.irctc.train.threads.Thread1;
import com.irctc.train.threads.Thread2;
import com.irctc.train.tickets.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread1 thread1 = new Thread1(ticket,5);thread1.setName("Thread1");
        Thread2 thread2 = new Thread2(ticket, 3);thread2.setName("Thread2");
        thread1.start();thread2.start();
//        ticket.getAvailability();
    }
}