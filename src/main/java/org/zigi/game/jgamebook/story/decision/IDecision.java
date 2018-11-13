package org.zigi.game.jgamebook.story.decision;

import org.zigi.game.jgamebook.Player;
import org.zigi.game.jgamebook.story.Chapter;

public interface IDecision {
	public Player getPlayer();

	public Chapter getNextChapter();

	public void setNextChapter(Chapter chapter);

	public boolean isActive();

	public void applyUpdates();
}
