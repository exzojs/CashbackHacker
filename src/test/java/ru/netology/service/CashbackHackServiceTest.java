package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    void shouldAmountBelowTheBorder() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    void shouldAmountOnBoard() {
        int actual = service.remain(1000);
        int expexted = 0;
        assertEquals(actual, expexted);
    }
    @Test
    void souldAmoutAboveBorder() {
        int actual = service.remain(10000);
        int expected = 0;
        assertEquals(actual, expected);
    }

}