package com.course.testing;


import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1()
    {

        System.out.println("这是测试用例1");
    }
    
    @Test
    public void testcase2()
    {
        System.out.println("这是测试用例2");
    }

    //在每个测试方法之前运行一次
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    //在每个测试方法之后运行一次
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    //在类运行之前运行一次
    @BeforeClass
    public void beforClass()
    {
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }

    //在类运行之后运行一次
    @AfterClass
    public void afterClass()
    {
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }

    //在整个测试集运行之前运行
    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("BeforSuit测试套件");
    }

    //在整个测试集运行之后运行
    @AfterSuite
    public void aftersuite()
    {
        System.out.println("AfterSuit测试套件");
    }


}
