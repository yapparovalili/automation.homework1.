package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
     public void testRemainMinCashbackHack() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);


    }

    @org.junit.Test
    public void testRemain() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);


    }
}
