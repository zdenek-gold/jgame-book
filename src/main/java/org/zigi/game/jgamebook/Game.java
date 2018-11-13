package org.zigi.game.jgamebook;

import org.zigi.game.jgamebook.exception.InvalidPlayerException;
import org.zigi.game.jgamebook.story.Story;

public class Game {
	private Player player;
	private Story story;

	private Boolean gameOver;

	public static Game getInstance(Player player, Story story) throws InvalidPlayerException {
		if (player.isValid() == false)
			throw new InvalidPlayerException(player);
		return new Game(player, story);
	}

	private Game(Player player, Story story) {
		this.player = player;
		this.story = story;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isValid() {
		if (isGameOver() != null)
			return false;
		if (story == null || story.isValid() == false)
			return false;
		if (player == null || player.isValid() == false)
			return false;
		return true;
	}

	public boolean start() {
		if (isValid())
			this.gameOver = false;
		return isGameOver();
	}

	public Boolean isGameOver() {
		return gameOver;
	}

}
