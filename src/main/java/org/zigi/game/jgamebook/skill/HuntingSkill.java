package org.zigi.game.jgamebook.skill;

public class HuntingSkill extends Skill {
	public static final String CODE = "hunting";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private HuntingSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new HuntingSkill();
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
