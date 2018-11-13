package org.zigi.game.jgamebook.skill;

public abstract class Skill {

	@Override
	public String toString() {
		return "Skill: " + getCode();
	}

	protected Skill() {

	}

	public abstract String getCode();

	public abstract String getName();

	public abstract String getDescription();

	@Override
	public boolean equals(Object obj) {
		if (obj == null || (obj instanceof Skill) == false)
			return false;

		Skill s = (Skill) obj;
		return s.getCode().equals(getCode());
	}
}
