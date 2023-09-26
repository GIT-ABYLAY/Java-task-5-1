package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelanceCalcService service = new FreelanceCalcService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        double mounthsAmount = service.calculate(income, expenses, threshold);
        System.out.println(mounthsAmount);
    }
}
