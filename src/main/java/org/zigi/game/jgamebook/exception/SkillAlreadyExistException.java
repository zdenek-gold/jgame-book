package org.zigi.game.jgamebook.exception;

import org.zigi.game.jgamebook.skill.Skill;

public class SkillAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2569402247492621073L;

	private Skill skill;

	public SkillAlreadyExistException(Skill skill) {
		super("Skill " + skill + " already exist!");
		this.skill = skill;
	}

	public Skill getSkill() {
		return skill;
	}
}
