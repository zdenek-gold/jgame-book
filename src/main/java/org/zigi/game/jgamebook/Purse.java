package org.zigi.game.jgamebook;

public class Purse {
	public static int DEFAULT_CAPACITY = 50;
	private int capacity = DEFAULT_CAPACITY;
	private int amount = 0;

	private Purse(int capacity) {
		this.capacity = capacity;
	}

	public static Purse getInstance() {
		return new Purse(DEFAULT_CAPACITY);
	}

	public int getAmount() {
		return amount;
	}

	public void add(int count) {
		amount = (amount + count) % capacity;
	}

	public void remove(int count) {
		if (count > amount)
			amount = 0;
		else
			amount -= count;
	}
}
