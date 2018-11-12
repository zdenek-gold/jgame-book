package org.zigi.game.jgamebook;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Game {
	private Player player;
	private Map<Integer, Chapter> chapters = new LinkedHashMap<Integer, Chapter>();
	private boolean running = false;

	public static Game getInstance(Player player) {
		return new Game(player);
	}

	private Game(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Map<Integer, Chapter> getChapters() {
		return chapters;
	}

	public void addChapters(List<Chapter> chapters) {
		for (Chapter ch : chapters)
			this.chapters.put(ch.getNumber(), ch);
	}

	public boolean isValid() {
		return false;
	}

	public boolean start() {
		if (isValid())
			this.running = true;
		return isRunning();
	}

	public boolean isRunning() {
		return running;
	}

}
