package org.zigi.game.jgamebook.story.decision;

import java.util.ArrayList;
import java.util.List;

import org.zigi.game.jgamebook.Player;
import org.zigi.game.jgamebook.story.Chapter;
import org.zigi.game.jgamebook.story.update.Update;

public abstract class Decision implements IDecision {
	protected Player player;
	protected Chapter chapter;
	protected List<Update> updates = new ArrayList<Update>();

	public Decision(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public abstract boolean isActive();

	public void setNextChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public Chapter getNextChapter() {
		return chapter;
	}

	public void addUpdate(Update u) {
		u.setPlayer(player);
		updates.add(u);
	}

	public void applyUpdates() {
		if (updates != null)
			for (Update u : updates)
				u.apply();
	}
}
