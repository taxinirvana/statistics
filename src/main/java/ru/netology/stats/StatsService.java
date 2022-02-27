package ru.netology.stats;

public class StatsService {

    public int totalAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {return totalAmount(sales) / sales.length;
    }

    public int maximumSales(int[] sales) {
        int currentMaks = sales[0];
        for (int sale : sales) {
            if (sale > currentMaks) {
                currentMaks = sale;
            }
        }
        return currentMaks;
    }

    public int minimumSales(int[] sales) {
        int currentMaks = sales[0];
        for (int sale : sales) {
            if (sale < currentMaks) {
                currentMaks = sale;
            }
        }
        return currentMaks;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int belowAverage(int[] sales) {
        int numberMonth = 0;

        for (long sale : sales) {

            if (sale < totalAmount(sales) / sales.length) {
                numberMonth = numberMonth + 1;
            }

        }
        return numberMonth;
    }
    public int aboveAverage(int[] sales) {
        int numberMonth = 0;

        for (long sale : sales) {

            if (sale > totalAmount(sales) / sales.length) {
                numberMonth = numberMonth + 1;
            }

        }
        return numberMonth;
    }
}
