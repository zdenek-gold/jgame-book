package org.zigi.game.jgamebook;

import java.util.HashSet;
import java.util.Set;

import org.zigi.game.jgamebook.exception.SkillAlreadyExistException;
import org.zigi.game.jgamebook.exception.TooLowLevelException;
import org.zigi.game.jgamebook.skill.Skill;
import org.zigi.game.jgamebook.util.Util;
import org.zigi.game.jgamebook.weapon.Weapon;

public class Player {
	public static int DEFAULT_LEVEL = 5;
	public static int RANDOM_VALUE = 10;
	public static int MIN_CONDITION = 20;
	public static int MIN_FIGHT_MASTERY = 10;

	// name
	private String name;
	// level

	private int level = DEFAULT_LEVEL;

	// properties
	private int maxCondition = Util.randomValue(RANDOM_VALUE) + MIN_CONDITION;
	private int condition = maxCondition;
	private int maxFightMastery = Util.randomValue(RANDOM_VALUE) + MIN_FIGHT_MASTERY;
	private int fightMastery = maxFightMastery;

	// skills
	private final Set<Skill> skills = new HashSet<Skill>();

	// weapons
	private Weapon leftHandWeapon = null;
	private Weapon rightHandWeapon = null;

	// bag
	private final Bag bag = Bag.getInstance();

	// purse
	private Purse purse = Purse.getInstance();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Player: " + getName() + "(" + level + ")");
		sb.append("\n\tFight mastery: " + fightMastery + "/" + maxFightMastery);
		sb.append("\n\tCondition: " + condition + "/" + maxCondition);
		sb.append("\n\tSkills:");
		for (Skill s : skills)
			sb.append("\n\t\t" + s);
		sb.append("\n\tLeft hand weapon:\n\t\t" + leftHandWeapon);
		sb.append("\n\tRight hand weapon:\n\t\t" + rightHandWeapon);
		sb.append("\n\t" + bag);
		sb.append("\n\t" + purse);

		return sb.toString();
	}

	public boolean isValid() {
		if (level < 5 || level > 8)
			return false;

		if (skills.size() < level)
			return false;

		return true;
	}

	private Player() {

	}

	public Player(String name) {
		this.name = name;
		this.level = DEFAULT_LEVEL;
		this.condition = maxCondition;
		this.fightMastery = maxFightMastery;
	}

	public static Player getInstance(String name) {
		Player p = new Player();
		p.setName(name);
		return p;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public void setPurse(Purse purse) {
		this.purse = purse;
	}

	public int getLevel() {
		return level;
	}

	public Purse getPurse() {
		return purse;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	public boolean hasSkill(Skill skill) {
		return skills.contains(skill);
	}

	public void addSkill(Skill skill) throws TooLowLevelException, SkillAlreadyExistException {
		if (skills.size() >= level)
			throw new TooLowLevelException(level);

		if (skills.contains(skill))
			throw new SkillAlreadyExistException(skill);

		skills.add(skill);
	}

	public Weapon getLeftHandWeapon() {
		return leftHandWeapon;
	}

	public void setLeftHandWeapon(Weapon leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}

	public Weapon getRightHandWeapon() {
		return rightHandWeapon;
	}

	public void setRightHandWeapon(Weapon rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}

	public Bag getBag() {
		return bag;
	}

	public int getMaxCondition() {
		return maxCondition;
	}

	public void increaseMaxCondition(int amount) {
		this.maxCondition += amount;
	}

	public int getCondition() {
		return condition;
	}

	public void increaseCondition(int condition) {
		this.condition = (this.condition + condition) % maxCondition;
	}

	public void decreaseCondition(int condition) {
		if (this.condition <= condition)
			this.condition = 0;
		else
			this.condition -= condition;
	}

	public boolean isAlive() {
		return condition > 0;
	}

	public int getMaxFightMastery() {
		return maxFightMastery;
	}

	public void increaseMaxFightMastery(int amount) {
		this.maxFightMastery += amount;
	}

	public void setMaxFightMastery(int maxFightMastery) {
		this.maxFightMastery = maxFightMastery;
	}

	public int getFightMastery() {
		return fightMastery;
	}

	public void setFightMastery(int fightMastery) {
		this.fightMastery = fightMastery;
	}
}
