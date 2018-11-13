package org.zigi.game.jgamebook.skill;

public class MaskingSkill extends Skill {
	public static final String CODE = "masking";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private MaskingSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new MaskingSkill();
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
