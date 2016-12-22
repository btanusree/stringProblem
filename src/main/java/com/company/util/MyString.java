package com.company.util;

public class MyString {
	
	/* Given a String and a Character, remove all instances of the Character in the String
	 * Iterate through the String, one character at a time
	 * 
	 */
	public String removeCharInString(String sStr, char c) {
		StringBuilder st = new StringBuilder();
		for(int i = 0; i < sStr.length(); i++) {
			if(sStr.charAt(i) != c) 
				st.append(sStr.charAt(i));
		}
		
		return st.toString();
	}
	
	
	/* Given a String and a Character, remove all instances of the Character in the String
	 * Find a method in the String class that can solve this in one line
	 * 
	 */
	public String removeCharInStringWithReplace(String sStr, Character c) {
		return sStr.replaceAll(c.toString(), "");
	}

}