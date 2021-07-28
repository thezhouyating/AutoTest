package com.course.testing.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//测试套件运行之前需要运行的方法
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite运行了");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite运行了");
    }

    @BeforeTest
    public void beforetest()
    {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest");
    }
}
