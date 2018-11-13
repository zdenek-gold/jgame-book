package org.zigi.game.jgamebook.exception;

public class TooLowLevelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6846551273469851505L;
	private int level;

	public TooLowLevelException(int level) {
		super("Your level " + level + " is too low!");
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}
