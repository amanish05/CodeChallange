package com.example.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Kumar
 *
 */
public class CodeChallenge {
	
	/**	This function finds the longest word available in the string.
	 * It presume that each word will be separated only by one space. In case of empty/null string it will return LongestWord object with null value.
	*/
	public LongestWord findLongest(String sentence){
		
		LongestWord longest = null;
		if(sentence == null || sentence.trim().length() == 0)
			return longest;
						
		List<String> allWords = Arrays.asList(sentence.split(" "));
		if(allWords.size() == 1) {
			longest = new LongestWord();
			longest.setLength(allWords.get(0).length());
			longest.setWord(allWords.get(0));
			return longest;
		}		
		
		longest = allWords.stream()
				.map(word -> new LongestWord(word, word.length()))
				.max(Comparator.comparingInt(LongestWord::getLength))
				.get();		
				
		return longest;
	}

}
