package ru.netology.javaQA38.Homework_7_1.stats;

public class StatsService {

    // 1.Суммa всех продаж

    public int sumSales(long[] sales) {
        int summa = 0;
        for (long sum : sales) {
            summa += sum;
        }
        return summa;

    }

    // 2. Средняя сумма продаж в месяц
    public int averageSumSales(long[] sales) {
        int averade = sumSales(sales);
        return averade / 12;
    }

    // 3. Номер месяца в которром был пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    // 4. Номер месяца в котором был мин продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth=i;
            }
        }
        return minMonth + 1;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего

    public int countMonthDownAverageSales(long[] sales) {
        int downMonth = 0;
        int averageSumm = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < averageSumm) {
                downMonth++;
            }

        }
        return downMonth;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего

    public int countMonthUpperAverageSales(long[] sales) {
        int upperMonth = 0;
        int averageSumm = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > averageSumm) {
                upperMonth++;
            }

        }
        return upperMonth;
    }
}
