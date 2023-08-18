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
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum += salesMonth[i];

        }
        return sum / salesMonth.length;
    }

    public int recentPeakSales(int[] salesMonth) {
        int peakSalesIndex = 0;
        int peakSalesValue = salesMonth[0];
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] >= peakSalesValue) {
                peakSalesValue = salesMonth[i];
                peakSalesIndex = i;
            }
        }
        return peakSalesIndex;
    }

    public int recentMinSales(int[] salesMonth) {
        int minSalesIndex = 0;
        int minSalesValue = salesMonth[0];
        for (int i = 0; i < salesMonth.length; i++) {
            if (salesMonth[i] < minSalesValue) {
                minSalesValue = salesMonth[i];
                minSalesIndex = i;
            }
        }
        return minSalesIndex;
    }
    public int countSalesIndexesBelowAverage(int[] salesMonth) {
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum += salesMonth[i];
            }
        int average  = sum / salesMonth.length;

        int count = 0;
        for (int i =0; i < salesMonth.length; i++){
            if (salesMonth[i] < average) {
                count++;
            }
        }
return count;
    }
    public int countSalesIndexesAboveAverage(int[] salesMonth) {
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum += salesMonth[i];
        }
        int average  = sum / salesMonth.length;

        int count = 0;
        for (int i =0; i < salesMonth.length; i++){
            if (salesMonth[i] > average) {
                count++;
            }
        }
        return count;
}
}

