package org.zigi.game.jgamebook.story;

import org.zigi.game.jgamebook.Player;

public abstract class Update {
	protected Player player;

	public void setPlayer(Player p) {
		this.player = p;
	}

	public Player getPlayer() {
		return player;
	}

	public abstract void apply();

}
