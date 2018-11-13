package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeAxe extends WeaponType {
	public static final String WEAPON_TYPE = "axe-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeAxe(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeAxe(WEAPON_TYPE);
		return INSTANCE;
	}

}
