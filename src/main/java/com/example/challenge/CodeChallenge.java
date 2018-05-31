package com.example.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CodeChallenge {
	
	public LongestWord findLongest(String sentence){
		List<String> allWords = Arrays.asList(sentence.split(" "));
		LongestWord longest = null;
		if(!allWords.isEmpty()) {
			longest = allWords.stream()
					.map(word -> new LongestWord(word, word.length()))
					.max(Comparator.comparingInt(LongestWord::getLength))
					.get();
		}		
		return longest;
	}

}
