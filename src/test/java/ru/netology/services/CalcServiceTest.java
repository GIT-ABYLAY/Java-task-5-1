package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

    //@ParameterizedTest
    //@CsvSource({
    //       "10000,3000,20000"
    //})
    //public void calcMonthAmountPar(int expected, int income, int expenses, int threshold) {
    //FreelanceCalcService service = new FreelanceCalcService();
    //int actual = service.calculate(income, expenses, threshold);
    // Assertions.assertEquals(expected, actual);
    // }
    @Test
    public void calcMonthAmount(){
        FreelanceCalcService service = new FreelanceCalcService();

        int expected = 3;
        int actual = service.calculate(10000,3000,20000);

        Assertions.assertEquals(expected,actual);
    }


}
