package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeShortSword extends WeaponType {
	public static final String WEAPON_TYPE = "short-sword-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeShortSword(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeShortSword(WEAPON_TYPE);
		return INSTANCE;
	}

}
