package com.example.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Kumar
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class McCodeChallengeApplicationTests {	
	
	private String sentence = null;
	private CodeChallenge code;
	
	
	/*This is setup method to initialize test inputs*/
	@Before
	public void setUp() {
		sentence = "In the programming language of your choice create a class with a method to return the "
				+ "length and longest words in a sentence. For example, \" The cow jumped over the moon.\" should return 6 and \"jumped\".";
		
		code = new CodeChallenge();
		
	}
	
	/*This test case takes a sentance and find out the longest word and its length 
	and compare it with static test word to insure functionality of our project
	*/
	@Test	 
	public void testLongestWord() {		
		LongestWord longest = code.findLongest(sentence);		
		LongestWord longestWordTest = new LongestWord("programming", new Integer(11));		
		assertEquals(longest.compareTo(longestWordTest), 1);		
	}
	
	
	/*This test case checks for base case such as passing empty string or string containing only white spaces 
	 and assert the value to be return as null object of type LongestWord.
	*/
	@Test
	public void testLongestWordForSpaces() {		
		String st = " ";
		LongestWord longest = code.findLongest(st);
		assertNull(longest);		
	}
	
	/*This test case checks for base case such as passing null value
	 and assert the value to be return as null object of type LongestWord.
	*/
	@Test
	public void testLongestWordForNull() {		
		String st = null;
		LongestWord longest = code.findLongest(st);
		assertNull(longest);		
	}

}
