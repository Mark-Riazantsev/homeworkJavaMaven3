package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] salesMonth) {
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum += salesMonth[i];

        }
        return sum;
    }
}

//        public int minSales(long[] sales) {
  //          int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
//
  //          for (int i = 0; i < sales.length; i++) {
    //            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
      //              minMonth = i; // запомним его как минимальный
        //        }
          //  }

            //return minMonth + 1;

            //public int minSales(long[] sales) {
              //  int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
//
  //              for (int i = 0; i < sales.length; i++) {
    //                if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
      //                  minMonth = i; // запомним его как минимальный
        //            }
          //      }

            //    return minMonth + 1;
            //}
//}
