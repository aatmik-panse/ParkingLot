package models;

import java.sql.Time;

public class Ticket {
    private int id;
    private String number;
    private Time entryTime;
    private Time exitTime;
    private Vehicle vehicle;
    private Gate entryGate;
    private Gate exitGate;
    private Operator operator;
    private Status status;
    private ParkingSpot parkingSpot;

}
