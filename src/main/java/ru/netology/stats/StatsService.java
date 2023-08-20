package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] salesMonth) {
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum += salesMonth[i];

        }
        return sum;
    }

    public int averageSumSales(int[] salesMonth) {
        return sumSales(salesMonth) / 12;
    }

    public int recentPeakSales(int[] salesMonth) {
        int peakSalesIndex = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] >= salesMonth[peakSalesIndex]) {
                peakSalesIndex = i;
            }
        }
        return peakSalesIndex + 1;
    }

    public int recentMinSales(int[] salesMonth) {
        int minSalesIndex = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] <= salesMonth[minSalesIndex]) {
                minSalesIndex = i;
            }
        }
        return minSalesIndex + 1;
    }

    public int countSalesIndexesBelowAverage(int[] salesMonth) {
        int count = 0;
        int averageSale = averageSumSales(salesMonth);
        for (int sale : salesMonth) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int countSalesIndexesAboveAverage(int[] salesMonth) {
        int count = 0;
        int averageSale = averageSumSales(salesMonth);
        for (int sale : salesMonth) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}

