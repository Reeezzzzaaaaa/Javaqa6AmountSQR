package ru.netology.javaqa.javaqamvn.services;

public class SQRServiceMin {

    public int calcSQRMin(int rangeMin, int rangeMax) {

        for (int i = 10; i <= rangeMax; i++) {
            if (i < 10) {
                continue;
            }
            if (i * i >= rangeMin) {
                return i;
            }
        }
        return -1;
    }
}