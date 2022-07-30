package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculated() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldSmallAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 50;
        int expected = 950;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldBigAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int expected = 50;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThenEvenSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}