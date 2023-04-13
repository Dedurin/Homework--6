package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
    @Test

    public void FindsСalcSQRT() {
        SquareRoot service = new SquareRoot();
        int expected = 11;
        int actual = service.calcSQRT(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void notFindСalcSQRT() {
        SquareRoot service = new SquareRoot();
        int expected = 11;
        int actual = service.calcSQRT(100, 400);
        Assertions.assertEquals(expected, actual);
    }
}
