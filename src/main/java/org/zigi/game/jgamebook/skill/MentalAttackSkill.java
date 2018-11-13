package org.zigi.game.jgamebook.skill;

public class MentalAttackSkill extends Skill {
	public static final String CODE = "mental-attack";

	private static Skill INSTANCE = null;
	public static String NAME;
	public static String DESCRIPTION;

	private MentalAttackSkill() {

	}

	public static Skill getInstance() {
		if (INSTANCE == null)
			INSTANCE = new MentalAttackSkill();
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
