package com.company.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.company.util.MyString;

/*
 * 
 */
@RunWith(value = Parameterized.class)
public class ParameterizedStringTest {

	private String psInputString = null;
	private Character pReplaceChar;
	private String psExceptedOutput = null;

	 public ParameterizedStringTest(String sInputString, Character replaceChar, String sExceptedOutput) {
		 psInputString = sInputString;
		 pReplaceChar = replaceChar;
		 psExceptedOutput = sExceptedOutput;
	 }


	 @Parameters
	 public static List<Object[]> data() {
	   // Multiple inputs
	   Object[][] input = { 
			   				{"APPLE", 'A', "PPLE"}, 
			   				{"It has a application", 'a', "It hs  ppliction"},
			   				{"APPLICATION", 'a', "APPLICATION"},
			   				{"my app's", '\'', "my apps"},
			   				{"It has a application", ' ', "Ithasaapplication"}
	   					  };
	   
	   return Arrays.asList(input);
	 }
	 

	 @Test
	 public void testRemoveCharInString() {
		 try {
			 Assert.assertEquals(psExceptedOutput, new MyString().removeCharInString(psInputString, pReplaceChar));
			 System.out.println("Success (testRemoveCharInString) - String input : " + psInputString + ", replace character : " + pReplaceChar);
		 }
		 catch(ComparisonFailure exp) {
			 System.out.println("Failed (testRemoveCharInString) - String input : " + psInputString + ", replace character : " + pReplaceChar);
		 }
	 }
	 
	 @Test
	 public void testRemoveCharInStringWithReplace() {
		 try {
			 Assert.assertEquals(psExceptedOutput, new MyString().removeCharInStringWithReplace(psInputString, pReplaceChar));
			 System.out.println("Success (removeCharInStringWithReplace) - String input : " + psInputString + ", replace character : " + pReplaceChar);
		 }
		 catch(ComparisonFailure exp) {
			 System.out.println("Failed (removeCharInStringWithReplace) - String input : " + psInputString + ", replace character : " + pReplaceChar);
		 }
	 }
}
