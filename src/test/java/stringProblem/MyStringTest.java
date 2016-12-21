package stringProblem;

import org.junit.Assert;

import org.junit.Test;

public class MyStringTest {
	
	@Test
	public void test1() {
		String str = "APPLE";
		char c = 'A';
		
		Assert.assertEquals("PPLE", new MyString().remove1(str, c));
	}
	
	@Test
	public void test11() {
		String str = "APPLICATION";
		char c = 'A';
		
		Assert.assertEquals("PPLICTION", new MyString().remove1(str, c));
	}
	
	@Test
	public void test111() {
		String str = "EAGLE";
		char c = 'P';
		
		Assert.assertEquals("EAGLE", new MyString().remove1(str, c));
	}
	
	@Test
	public void test1111() {
		String str = "";
		char c = Character.MIN_VALUE;
		
		Assert.assertEquals("", new MyString().remove1(str, c));
	}
	
	
	@Test
	public void test2() {
		String str = "APPLE";
		char c = 'A';
		
		Assert.assertEquals("PPLE", new MyString().remove2(str, c));
	}

	
	//@Test
	public void test22() {
		String str = "APPLICATION";
		char c = 'A';
		
		Assert.assertEquals("PPLICTION", new MyString().remove2(str, c));
	}
	
	@Test
	public void test222() {
		String str = "EAGLE";
		char c = 'P';
		
		Assert.assertEquals("EAGLE", new MyString().remove2(str, c));
	}
	
	@Test
	public void test2222() {
		String str = "";
		char c = Character.MIN_VALUE;
		
		Assert.assertEquals("", new MyString().remove2(str, c));
	}
}
