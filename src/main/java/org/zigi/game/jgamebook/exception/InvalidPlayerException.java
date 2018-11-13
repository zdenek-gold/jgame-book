package org.zigi.game.jgamebook.exception;

import org.zigi.game.jgamebook.Player;

public class InvalidPlayerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8522517275411922504L;
	private Player player;

	public InvalidPlayerException(Player player) {
		super("Player " + player.getName() + " is invalid!");
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}
}
