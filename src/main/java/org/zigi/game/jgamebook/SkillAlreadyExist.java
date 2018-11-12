package org.zigi.game.jgamebook;

public class SkillAlreadyExist extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6846551273469851505L;
	private String code;

	public SkillAlreadyExist(String code) {
		super("Skill with code=" + code + " already exist!");
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
