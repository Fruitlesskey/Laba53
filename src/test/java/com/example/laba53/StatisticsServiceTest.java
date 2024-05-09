package com.example.laba53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatisticsServiceTest {
  @Test
   void findMaxWithMaxAtTheBeginning() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMaxWithMaxInTheMiddle() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {5, 8, 4, 5, 14, 3, 8, 6, 11, 11, 12};
    long expected = 14;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMaxWithMaxAtTheEnd() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 15};
    long expected = 15;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
  }
}