package ru.netology.javaqa.javaqamvn.services;

public class RangeService {

    public int calcRange(int rangeMin, int rangeMax) {

        int min = 0;
        int max = 0;

        for (int i = 0; i <= rangeMax; i++) {
            if (i < 10) {
                min = 10;
                break;
            }

            if (i * i >= rangeMin) {
                break;
            }
            else min = i;
        }

        for (int j = 10; j <= rangeMax; j++) {
            if (j < 10) {
                continue;
            }
            if (j > 99) {
                j = 99;
                break;
            }
            else max = j;

            if (j * j >= (rangeMax + 1)) {
                max = j - 1;
                break;
            }
        }
        int range = (max - min) + 1;
        return range;
    }
}


