package org.zigi.game.jgamebook;

public class Chapter {
	private int number;
	private String text;

	public Chapter(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
