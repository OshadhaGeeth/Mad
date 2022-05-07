package com.example.distancediner;

public class Trips {
    String date;
    String trip;
    String expenses;
    String income;


    public Trips(String date, String trip, String expenses, String income) {
        this.date = date;
        this.trip = trip;
        this.expenses = expenses;
        this.income = income;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
