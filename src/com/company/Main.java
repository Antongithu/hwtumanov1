package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int gramsInKg = 1000;

        int bananaWeight = 80;
        int bananAmount = 5;

        int milkWeight = 105;
        int milkAmount = 2;

        int iceCreamWeight = 100;
        int iceCreamAmount = 2;

        int eggWeight = 70;
        int eggAmount = 4;

        int result = (bananaWeight * bananAmount) + (milkWeight * milkAmount) + (iceCreamWeight * iceCreamAmount) * (eggWeight * eggAmount);
        System.out.println("Вес коктейля в граммах " + result);
        float resultInKg = result / (gramsInKg * 1.0f);
        System.out.println("Вес коктейля в килограммах: " + resultInKg);

        int needToLoseKgs = 7;

        int gramsInKgs = 1000;

        int needToLoseGrams = needToLoseKgs * gramsInKg;

        int minGramsPerDey = 250;
        int maxGramsPerDay = 500;

        int minDays = needToLoseGrams / maxGramsPerDay;
        int maxDays = needToLoseGrams / minGramsPerDey;

        int avg = (minDays + maxDays) / 2;
        System.out.println("min " + minDays);
        System.out.println("max " + maxDays);
        System.out.println("Averege: " + avg);

        float mashaSalary = 67_760;
        float denisSalary = 83_690;
        float kristinaSalary = 76_230;

        int percent = 20;
        float newSalaryMultiplier = 1 + (percent / 100f);

        float mashaNewSalary = mashaSalary * newSalaryMultiplier;
        float mashaTotalSummaryDiff = (mashaNewSalary - mashaSalary) * 12;

        float denisNewSalary = denisSalary * newSalaryMultiplier;
        float denisTotalSummaryDiff = (denisNewSalary - denisSalary) * 12;

        float kristinaNewSalary = kristinaSalary * newSalaryMultiplier;
        float kristinaTotalSummaryDiff = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает: " + mashaNewSalary + ". " + "Годовой доход вырос на " + mashaTotalSummaryDiff);
        System.out.println("Денис теперь получает " + denisNewSalary + ". " + "Годовой доход вырос на " + denisTotalSummaryDiff);
        System.out.println("Кристина теперь получает " + kristinaNewSalary + ". " + "Годовой доход вырос на " + kristinaTotalSummaryDiff);

        byte people = 127;
        System.out.println(people);

        short dollars = 32767;
        System.out.println(dollars);

        int edge = 2147483647;
        System.out.println(edge);

        long faces = 9223372036854775807L;
        System.out.println(faces);

        float liters = 3.4F;
        System.out.println(liters);

        double unit = 1.7;
        System.out.println(unit);

        char homeless = 0;
        System.out.println(homeless);

        boolean b = true;
        System.out.println(b);


        float boxerOne = 78.2f;
        float boxersTwo = 82.7f;
        float boxerWeight = boxerOne + boxersTwo;
        System.out.println(boxerWeight);

        float first = 78.2f;
        float second = 82.7f;
        float result = second - first;
        System.out.println("first - second = " + result);
    }
}
