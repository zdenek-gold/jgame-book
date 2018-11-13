package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeLongSword extends WeaponType {
	public static final String WEAPON_TYPE = "long-sword-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeLongSword(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeLongSword(WEAPON_TYPE);
		return INSTANCE;
	}

}
