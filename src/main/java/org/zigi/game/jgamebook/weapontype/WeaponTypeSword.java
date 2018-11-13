package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeSword extends WeaponType {
	public static final String WEAPON_TYPE = "sword-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeSword(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeSword(WEAPON_TYPE);
		return INSTANCE;
	}

}
