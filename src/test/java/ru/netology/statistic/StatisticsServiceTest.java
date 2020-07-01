package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {11, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;
    long unused = 42;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
}