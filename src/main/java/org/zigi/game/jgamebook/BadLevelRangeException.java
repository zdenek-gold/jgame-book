package org.zigi.game.jgamebook;

public class BadLevelRangeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4381902037959883299L;
	private int level;

	public BadLevelRangeException(int level) {
		super("Invalid level number " + level + ". Must be in range from 5 to 8!");
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}
