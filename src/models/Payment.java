package models;
import java.sql.Time;

public class Payment {
    private int id;
    private Bill bill;
    private Mode mode;
    private Status status;
    private Time time;
    private double amount;

}