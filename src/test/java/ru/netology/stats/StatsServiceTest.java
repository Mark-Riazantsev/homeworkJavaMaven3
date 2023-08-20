package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindTheSum() {
        StatsService service = new StatsService();

        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(salesMonths);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindTheAverageSum() {
        StatsService service = new StatsService();

        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.averageSumSales(salesMonths);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);

    }

    @Test
    public void shouldFindTheRecentPeakSales() {
        StatsService service = new StatsService();

        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedPicksales = 8;
        int actualPicksales = service.recentPeakSales(salesMonths);

        Assertions.assertEquals(expectedPicksales, actualPicksales);
    }

    @Test
    public void shouldFindTheRecentMinSales() {
        StatsService service = new StatsService();

        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 8;
        int actualAverageSum = service.recentPeakSales(salesMonths);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldFindTheCountIndexesBelowAverage() {
        StatsService service = new StatsService();

        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.recentPeakSales(salesMonths);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldFindTheCountIndexesAboveAverage() {
        StatsService service = new StatsService();

        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.recentPeakSales(salesMonths);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}