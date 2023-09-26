package ru.netology.services;
public class FreelanceCalcService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int mounth = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                mounth++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return mounth;
    }
}
