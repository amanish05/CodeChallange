package com.example.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class McCodeChallengeApplicationTests {
	
	private String sentence = "In the programming language of your choice create a class with a method to return the "
			+ "length and longest words in a sentence. For example, \" The cow jumped over the moon.\" should return 6 and \"jumped\".";
	private CodeChallenge code = new CodeChallenge();
	
	@Test
	public void testLongestWord() {		
		LongestWord longest = code.findLongest(sentence);
		assertEquals("programming", longest.getWord());
		assertEquals(new Integer(11), longest.getLength());
	}
	
	@Test
	public void testLongestWordNull() {		
		String st = " ";
		LongestWord longest = code.findLongest(st);
		assertNull(longest);
		
	}

}
