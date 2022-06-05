package ru.netology.javaqa.javaqamvn.services;

public class RangeService {

    public int calcRange(int rangeMin, int rangeMax) {

        SQRServiceMin sqrServiceMin = new SQRServiceMin();
        int min = sqrServiceMin.calcSQRMin(rangeMin, rangeMax);

        SQRServiceMax sqrServiceMax = new SQRServiceMax();
        int max = sqrServiceMax.calcSQRMax(rangeMin, rangeMax);

        int range = (max - min) + 1;
        return range;
    }
}

