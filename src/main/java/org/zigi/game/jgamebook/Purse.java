package org.zigi.game.jgamebook;

import org.zigi.game.jgamebook.util.Util;

public class Purse {
	public static int DEFAULT_CAPACITY = 50;
	public static int RANDOM_AMOUNT = 10;
	private int capacity = DEFAULT_CAPACITY;
	private int amount = 0;

	private Purse(int capacity) {
		this.capacity = capacity;
		this.amount = Util.randomValue(RANDOM_AMOUNT);
	}

	public static Purse getInstance() {
		return new Purse(DEFAULT_CAPACITY);
	}

	public int getAmount() {
		return amount;
	}

	public void increment(int count) {
		if (count < 0)
			decrement(-count);
		else
			amount = (amount + count) % capacity;
	}

	public void decrement(int count) {
		if (count < 0)
			increment(-count);
		else {
			if (count > amount)
				amount = 0;
			else
				amount -= count;
		}
	}

	@Override
	public String toString() {
		return "Purse (" + amount + "/" + capacity + ")";
	}
}
