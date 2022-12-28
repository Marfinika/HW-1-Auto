package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainNull() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);


    }
    @Test
    public void testRemain300() {
        int actual = service.remain(700);
        int expected = 300;

        Assert.assertEquals(actual, expected);
    }
}