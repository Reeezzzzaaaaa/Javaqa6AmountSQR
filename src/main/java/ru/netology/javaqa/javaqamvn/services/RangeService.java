package ru.netology.javaqa.javaqamvn.services;

public class RangeService {

    public int calcRange(int rangeMin, int rangeMax) {

        SQRService sqrService = new SQRService();
        int min = sqrService.calcSQRMin(rangeMin, rangeMax);
        int max = sqrService.calcSQRMax(rangeMin, rangeMax);

        int range = (max - min) + 1;
        return range;
    }
}

