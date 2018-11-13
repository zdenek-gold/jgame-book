package org.zigi.game.jgamebook.story.decision;

import org.zigi.game.jgamebook.Player;
import org.zigi.game.jgamebook.skill.Skill;
import org.zigi.game.jgamebook.story.Chapter;
import org.zigi.game.jgamebook.util.Util;

public class SkillRequiredRandomDecision extends RandomDecision {

	private Skill requiredSkill;
	private int increment = 0;

	public SkillRequiredRandomDecision(Player player, int increment) {
		super(player);
		this.increment = increment;
	}

	public Skill getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(Skill requiredSkill) {
		this.requiredSkill = requiredSkill;
	}

	public int getIncrement() {
		return increment;
	}

	public Chapter getNextChapter() {
		int sumChance = 0;
		for (Chapter ch : chapters.keySet())
			sumChance += chapters.get(ch);

		int random = Util.randomValue(sumChance) + (player.hasSkill(requiredSkill) ? increment : 0);
		Chapter lastActive = null;
		for (Chapter ch : chapters.keySet()) {
			lastActive = ch;
			random -= chapters.get(ch);
			if (random <= 0)
				return ch;
		}
		return lastActive;
	}

}
