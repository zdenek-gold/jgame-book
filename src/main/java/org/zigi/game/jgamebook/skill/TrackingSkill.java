package org.zigi.game.jgamebook.skill;

public class TrackingSkill extends Skill {
	public static final String CODE = "tracking";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private TrackingSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new TrackingSkill();
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
