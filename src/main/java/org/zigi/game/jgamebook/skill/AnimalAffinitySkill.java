package org.zigi.game.jgamebook.skill;

public class AnimalAffinitySkill extends Skill {
	public static final String CODE = "animal-affinity";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private AnimalAffinitySkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new AnimalAffinitySkill();
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
