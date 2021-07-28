package com.course.testing.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//xml文件参数化
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age)
    {
        System.out.println("name="+name+";age="+age);
    }
}
