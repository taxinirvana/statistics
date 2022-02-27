package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldTotalAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 166;

        int actual = service.totalAmount(sales);
        assertEquals(expected, actual);


    }

    @Test
    void shouldAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 15;

        int actual = service.averageSalesAmount(sales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldMaximumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 20;

        int actual = service.maximumSales(sales);
        assertEquals(expected, actual);


    }

    @Test
    void shouldMinimumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 7;

        int actual = service.minimumSales(sales);
        assertEquals(expected, actual);


    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 9;

        int actual = service.minSales(minMonth);
        assertEquals(expected, actual);


    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 8;

        int actual = service.maxSales(maxMonth);
        assertEquals(expected, actual);


    }

    @Test
    void shouldBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 4;

        int actual = service.belowAverage(sales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18};
        int expected = 5;

        int actual = service.aboveAverage(sales);
        assertEquals(expected, actual);
    }
}