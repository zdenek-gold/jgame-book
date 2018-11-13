package org.zigi.game.jgamebook.skill;

public class HealingSkill extends Skill {
	public static final String CODE = "healing";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private HealingSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new HealingSkill();
		return INSTANCE;
	}

	@Override
	public String getCode() {
		return CODE;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
