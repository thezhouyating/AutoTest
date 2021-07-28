package com.course.testing;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1()
    {
        System.out.println("igonre1执行");
    }

    @Test(enabled = false)
    public void igonre2()
    {
        System.out.println("ignore2执行");
    }

    @Test(enabled = true)
    public void ignore3()
    {
        System.out.println("ignore3执行");
    }

}
