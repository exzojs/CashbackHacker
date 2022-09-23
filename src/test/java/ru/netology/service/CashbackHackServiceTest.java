package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldAmountBelowTheBorder() {
        int actual = service.remain(900);
        Assert.assertEquals(100, actual);
    }
    @Test
    public void shouldAmountOnBoard() {
        int actual = service.remain(1000);
        Assert.assertEquals(0, actual);
    }
    @Test
    public void souldAmoutAboveBorder() {
        int actual = service.remain(10000);
        Assert.assertEquals(0, actual);
    }

}