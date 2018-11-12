package org.zigi.game.jgamebook;

public class Food implements IBagItem {
	public static final String FOOD_CODE = "food";

	private Food() {
	}

	public static Food getInstance() {
		return new Food();
	}

	public String getCode() {
		return FOOD_CODE;
	}
}
