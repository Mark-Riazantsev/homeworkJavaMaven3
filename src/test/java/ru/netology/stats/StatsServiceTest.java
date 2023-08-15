package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();

        int[] salesMonths = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSum = 180;
        int actualSum = service.sumSales(salesMonths);

        Assertions.assertEquals(expectedSum, actualSum);

    }
}