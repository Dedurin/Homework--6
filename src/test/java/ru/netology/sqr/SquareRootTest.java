package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
    @Test

    public void FindsСalcSQRT() {
        SquareRoot service = new SquareRoot();
        int quantity = 3;
        int Range = service.calcSQRT(200, 300);
        Assertions.assertEquals(Range, quantity);
    }

    @Test

    public void notFindСalcSQRT() {
        SquareRoot service = new SquareRoot();
        int quantity = 11;
        int Range = service.calcSQRT(100, 400);
        Assertions.assertEquals(Range, quantity);
    }
}
