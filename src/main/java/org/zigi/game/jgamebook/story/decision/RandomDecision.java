package org.zigi.game.jgamebook.story.decision;

import java.util.LinkedHashMap;
import java.util.Map;

import org.zigi.game.jgamebook.Player;
import org.zigi.game.jgamebook.story.Chapter;
import org.zigi.game.jgamebook.util.Util;

public class RandomDecision extends Decision {

	protected Map<Chapter, Integer> chapters = new LinkedHashMap<Chapter, Integer>();

	public RandomDecision(Player player) {
		super(player);
	}

	public void addRandomChapter(Chapter chapter, Integer chance) {
		chapters.put(chapter, chance);
	}

	@Override
	public boolean isActive() {
		return true;
	}

	public Chapter getNextChapter() {
		int sumChance = 0;
		for (Chapter ch : chapters.keySet())
			sumChance += chapters.get(ch);

		int random = Util.randomValue(sumChance);
		for (Chapter ch : chapters.keySet()) {
			random -= chapters.get(ch);
			if (random <= 0)
				return ch;
		}
		return null;
	}
}
