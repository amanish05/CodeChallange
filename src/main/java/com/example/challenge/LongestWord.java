package com.example.challenge;

 /*This class is used for keeping track of data with two properties
 Length of longest word and the word itself*/

public class LongestWord implements Comparable<LongestWord>{
	
	private String word;
	private Integer length;
	
	public LongestWord(String word, int length) {
		this.word = word;
		this.length = length;
	}
	
	public LongestWord() {		
	}

	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}



	@Override
	public int compareTo(LongestWord o) {
		if(this.getLength()==o.getLength() && this.getWord().equals(o.getWord()))
		return 1;
		
		return 0;
	}	
	
	
	
}
