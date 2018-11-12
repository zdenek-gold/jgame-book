package org.zigi.game.jgamebook;

import java.util.HashSet;
import java.util.Set;

public class Player {
	private String name;
	private int level = 5;
	private Set<Skill> skills = new HashSet<Skill>();

	private Player() {

	}

	public Player(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public static Player getInstance(String name, int level) throws BadLevelRangeException {
		if (level < 5 || level > 8)
			throw new BadLevelRangeException(level);

		Player p = new Player();
		p.setName(name);
		p.setLevel(level);
		return p;
	}

	public static Player getInstance(String name, Set<Skill> skills) {
		Player p = new Player();
		p.setName(name);
		p.setSkills(skills);
		p.setLevel(skills.size());
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

	private void setLevel(int level) {
		this.level = level;
	}

	public Set<Skill> getSkills() {
		return skills;
	}

	private void setSkills(Set<Skill> skills) {
		this.skills.addAll(skills);
	}

	public void addSkill(Skill skill) throws TooLowLevelException, SkillAlreadyExistException {
		if (skills.size() >= level)
			throw new TooLowLevelException(level);

		if (skills.contains(skill))
			throw new SkillAlreadyExistException(skill);

		skills.add(skill);
	}

}
