package ru.shatsckij.vacationpaycalculator.model;

public class Employee {
    private double avgSalary;
    private int vacationDays;

    public double calculateVacationPay() {
        return (avgSalary / 29.3) * vacationDays;
    }

    public double getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public Employee() {
    }

    public Employee(double avgSalary, int vacationDays) {
        this.avgSalary = avgSalary;
        this.vacationDays = vacationDays;
    }
}
