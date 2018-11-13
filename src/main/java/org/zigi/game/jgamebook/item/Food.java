package org.zigi.game.jgamebook.item;

public class Food implements IBagItem {
	public static final String FOOD_CODE = "food";

	@Override
	public String toString() {
		return "Food";
	}

	private Food() {
	}

	public static Food getInstance() {
		return new Food();
	}

	public String getCode() {
		return FOOD_CODE;
	}
}
