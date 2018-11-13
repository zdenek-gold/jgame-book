package org.zigi.game.jgamebook.skill;

public class IntangibleShutterSkill extends Skill {
	public static final String CODE = "intangible-shutter";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private IntangibleShutterSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new IntangibleShutterSkill();
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
