package com.course.testing.multiThread;

import org.testng.annotations.Test;

public class MultThreadAnnotion {
    /*
    * invocationCount 表示执行的次数
    * threadPoolSize 表示线程池内的线程的个数
    * */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test()
    {
        System.out.println("1");
        System.out.printf("Thread ID :%s%n",Thread.currentThread().getId());
    }
}
