package com.global.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class GlobTest {
	@Test
	public void test_Url()
	{
		Assert.assertEquals("olx", "https://www.olx.com/");
	}
	
	@Test
	public void test_Title()
	
	{
		Assert.assertEquals("uber", "ola");
	}
	@Test()
	public void test1()
	{
		Assert.assertTrue(false);
	}

	@Test
	public void test_serachText()
	{
		Assert.assertTrue(true);
	}
	@Test()
	public void test2()
	{
	throw new SkipException("skipped");
	}
	@Test()
	public void test3()
	{
		throw new SkipException("skipped");
	}
	@Test()
	public void test4()
	{
		Assert.assertEquals(20, 10);
	}
	@Test()
	public void test5()
	{
		Assert.assertEquals("Amazon", "https://www.amazon.com/");
	}
	@Test()
	public void test6()
	{
		Assert.assertEquals("edgeops", "edgeop");
	}
	@Test()
	public void test7()
	{
		Assert.assertTrue(true);
	}
	@Test()
	public void test8()
	{
		Assert.assertTrue(true);
	}
	@Test()
	public void test9()
	{
		throw new SkipException("skipped");
	}
	@Test()
	public void test10()
	{
		throw new SkipException("skipped");
	}

}
