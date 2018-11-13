package org.zigi.game.jgamebook.skill;

public class TelekinesisSkill extends Skill {
	public static final String CODE = "telekinesis";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private TelekinesisSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new TelekinesisSkill();
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
