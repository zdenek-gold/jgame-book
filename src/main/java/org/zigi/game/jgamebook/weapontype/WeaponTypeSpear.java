package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeSpear extends WeaponType {
	public static final String WEAPON_TYPE = "spear-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeSpear(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeSpear(WEAPON_TYPE);
		return INSTANCE;
	}

}
