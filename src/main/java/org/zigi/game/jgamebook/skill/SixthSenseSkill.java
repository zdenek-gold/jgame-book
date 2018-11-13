package org.zigi.game.jgamebook.skill;

public class SixthSenseSkill extends Skill {
	public static final String CODE = "sixth-sense";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private SixthSenseSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SixthSenseSkill();
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
