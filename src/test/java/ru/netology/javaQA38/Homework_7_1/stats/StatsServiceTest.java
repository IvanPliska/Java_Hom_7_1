package ru.netology.javaQA38.Homework_7_1.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test // 1. Тест суммы всех продаж

    public void shouldSummSalesOfMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int summa = 180;
        int actualSum = service.sumSales(sales);
        assertEquals(summa, actualSum);

    }

    @Test // 2. Тест средней суммы всех продаж

    public void shouldFindAverageSummSalesOfMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSumma = 15;
        int actualAverageSumm = service.averageSumSales(sales);
        assertEquals(averageSumma, actualAverageSumm);
    }


    @Test // 3. Тест номера месяца в котором был пик продаж

    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int month = 8;
        int actualyMonth = service.maxSales(sales);

        assertEquals(month, actualyMonth);
    }

    @Test // 4. Тест номер месяца в котором был мин продаж

    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int month = 9;
        int actualyMonth = service.minSales(sales);

        assertEquals(month, actualyMonth);
    }

    @Test // 5. Тест кол-во месяцев, в которых продажи были ниже среднего

    public void shouldFindMonthMinAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int monthCount = 5;
        int actualMonthCount;
        actualMonthCount = service.countMonthDownAverageSales(sales);

        assertEquals(monthCount, actualMonthCount);

    }

    @Test // 6. Тест кол-во месяцев, в которых продажи были выше среднего

    public void shouldFindMonthMaxAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int monthCount = 5;
        int actualMonthCount = service.countMonthUpperAverageSales(sales);

        assertEquals(monthCount, actualMonthCount);
    }
}