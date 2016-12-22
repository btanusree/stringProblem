package com.company.test;

import org.junit.Assert;

import org.junit.Test;

import com.company.util.MyString;

public class MyStringTest {
	
	@Test
	public void test1() {
		String str = "APPLE";
		char c = 'A';
		
		Assert.assertEquals("PPLE", new MyString().removeCharInString(str, c));
	}
	
	@Test
	public void test11() {
		String str = "It has a application";
		char c = 'a';
		
		Assert.assertEquals("It hs PPLICTION", new MyString().removeCharInString(str, c));
	}
	
	@Test
	public void test111() {
		String str = "EAGLE";
		char c = 'P';
		
		Assert.assertEquals("EAGLE", new MyString().removeCharInString(str, c));
	}
	
	@Test
	public void test1111() {
		String str = "";
		char c = Character.MIN_VALUE;
		
		Assert.assertEquals("", new MyString().removeCharInString(str, c));
	}
	
	
	@Test
	public void test2() {
		String str = "APPLE";
		char c = 'A';
		
		Assert.assertEquals("PPLE", new MyString().removeCharInStringWithReplace(str, c));
	}

	
	@Test
	public void test22() {
		String str = "APPLICATION";
		char c = 'A';
		
		Assert.assertEquals("PPLICTION", new MyString().removeCharInStringWithReplace(str, c));
	}
	
	@Test
	public void test222() {
		String str = "EAGLE";
		char c = 'P';
		
		Assert.assertEquals("EAGLE", new MyString().removeCharInStringWithReplace(str, c));
	}
	
	@Test
	public void test2222() {
		String str = "";
		char c = Character.MIN_VALUE;
		
		Assert.assertEquals("", new MyString().removeCharInStringWithReplace(str, c));
	}
}
