package com.example.challenge;

public class LongestWord {
	
	private String word;
	private Integer length;
	
	public LongestWord(String word, int length) {
		this.word = word;
		this.length = length;
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
}
