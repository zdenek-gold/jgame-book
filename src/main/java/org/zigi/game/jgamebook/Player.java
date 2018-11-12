package org.zigi.game.jgamebook;

import java.util.HashSet;
import java.util.Set;

public class Player {
	public static int DEFAULT_LEVEL = 5;

	private String name;
	private int level = DEFAULT_LEVEL;
	private final Set<Skill> skills = new HashSet<Skill>();
	private Weapon leftHandWeapon = null;
	private Weapon rightHandWeapon = null;
	private final Bag bag = Bag.getInstance();

	private int maxCondition = Util.randomValue(10) + 20;
	private int condition = 0;

	private int maxFightMastery = Util.randomValue(10) + 10;
	private int fightMastery = 0;

	private Player() {

	}

	public Player(String name) {
		this.name = name;
		this.level = DEFAULT_LEVEL;
		this.condition = maxCondition;
		this.fightMastery = maxFightMastery;
	}

	public static Player getInstance(String name) throws BadLevelRangeException {
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

	public int getLevel() {
		return level;
	}

	public Set<Skill> getSkills() {
		return skills;
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

	public boolean isValid() {
		if (skills.size() < level)
			return false;
		return true;
	}

}
