package org.zigi.game.jgamebook.story.update;

public class GoldUpdate extends Update {

	private int change;

	private GoldUpdate(int change) {
		this.change = change;
	}

	public static GoldUpdate getInstance(int count) {
		return new GoldUpdate(count);
	}

	@Override
	public void apply() {
		if (change < 0)
			player.getPurse().decrement(-change);
		else
			player.getPurse().increment(change);

	}

}
