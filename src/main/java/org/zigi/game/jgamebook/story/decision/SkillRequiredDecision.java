package org.zigi.game.jgamebook.story.decision;

import org.zigi.game.jgamebook.Player;
import org.zigi.game.jgamebook.skill.Skill;

public class SkillRequiredDecision extends Decision {

	private Skill requiredSkill;

	public SkillRequiredDecision(Player player) {
		super(player);
	}

	public Skill getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(Skill requiredSkill) {
		this.requiredSkill = requiredSkill;
	}

	@Override
	public boolean isActive() {
		if (player.hasSkill(requiredSkill))
			return true;
		return false;
	}

}
