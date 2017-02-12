package com.test.jacoco.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
	
	@Test
	public void testMethod1(){
		HelloWorld hw=new HelloWorld();
		String ss=hw.testMethod1();
		Assert.assertEquals(ss, "Hello world!", "应返回Hello world!，现返回"+ss);
	}
	
	@Test
	public void testMethod2(){
		HelloWorld hw=new HelloWorld();
		int ss=hw.addMethod(1, 1);
		Assert.assertEquals(ss, 2, "应返回2，现返回"+ss);
	}
}
