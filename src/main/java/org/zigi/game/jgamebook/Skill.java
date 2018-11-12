package org.zigi.game.jgamebook;

public class Skill {
	public static final String MASKING_CODE = "masking";
	public static final String HUNTING_CODE = "hunting";
	public static final String SIXTH_SENSE_CODE = "sixth-sense";
	public static final String TRACKING_CODE = "tracking";
	public static final String HEALING_CODE = "healing";
	public static final String WEAPON_MASTERY_CODE = "weapon-mastery";
	public static final String INTANGIBLE_SHUTTER_CODE = "intangible-shutter";
	public static final String MENTAL_ATTACK_CODE = "mental-attack";
	public static final String ANIMAL_AFFINITY_CODE = "animal-affinity";
	public static final String TELEKINESIS_CODE = "telekinesis";

	public static final Skill MASKING = getInstance(MASKING_CODE);
	public static final Skill HUNTING = getInstance(HUNTING_CODE);
	public static final Skill SIXTH_SENSE = getInstance(SIXTH_SENSE_CODE);
	public static final Skill TRACKING = getInstance(TRACKING_CODE);
	public static final Skill HEALING = getInstance(HEALING_CODE);
	public static final Skill WEAPON_MASTERY = getInstance(WEAPON_MASTERY_CODE);
	public static final Skill INTANGIBLE_SHUTTER = getInstance(INTANGIBLE_SHUTTER_CODE);
	public static final Skill MENTAL_ATTACK = getInstance(MENTAL_ATTACK_CODE);
	public static final Skill ANIMAL_AFFINITY = getInstance(ANIMAL_AFFINITY_CODE);
	public static final Skill TELEKINESIS = getInstance(TELEKINESIS_CODE);

	private String code;
	private String name;
	private String description;

	protected Skill() {

	}

	private Skill(String code) {
		this.code = code;
	}

	public static Skill getInstance(String code) {
		return new Skill(code);
	}

	public static Skill getInstance(String code, String name) throws SkillAlreadyExist {
		Skill s = getInstance(code);
		s.setName(name);
		return s;
	}

	public static Skill getInstance(String code, String name, String description) throws SkillAlreadyExist {
		Skill s = getInstance(code);
		s.setName(name);
		s.setDescription(description);
		return s;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || (obj instanceof Skill) == false)
			return false;

		Skill s = (Skill) obj;
		return s.getCode().equals(getCode());
	}
}
