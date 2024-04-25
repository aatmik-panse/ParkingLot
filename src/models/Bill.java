package models;

import java.sql.Time;

public class Bill {
    private int id;
    private Ticket ticket;
    private double amount;
    private Time exitTime;
    private Time paymentTime;
    private Status status;

}