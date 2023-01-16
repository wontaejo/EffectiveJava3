package chapter02.item01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example01Test {
    @Test
    public void getBenzTest() {
        Example01 benz1 = Example01.getBenz();
        Example01 benz2 = Example01.getBenz();

        assertEquals(benz1.hashCode(), benz2.hashCode());
    }
}
