package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainNull() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
        //вводим сумму покупки 1000


    }
    @Test
    public void testRemain300() {
        int actual = service.remain(700);
        int expected = 300;

        Assert.assertEquals(expected, actual);
        //вводим сумму покупки 300
    }
}