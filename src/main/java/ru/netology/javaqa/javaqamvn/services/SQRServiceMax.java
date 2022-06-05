package ru.netology.javaqa.javaqamvn.services;

public class SQRServiceMax {
    public int calcSQRMax(int rangeMin, int rangeMax) {

        for (int i = 10; i <= rangeMax; i++) {
            if (i < 10) {
                continue;
            }
            if (i > 99) {
                i = 99;
                return i;
            }
            if (i * i >= (rangeMax + 1)) {
                int iMax = i - 1;
                return iMax;
            }
        }
        return -1;
    }
}
