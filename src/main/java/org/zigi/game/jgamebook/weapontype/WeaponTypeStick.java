package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeStick extends WeaponType {
	public static final String WEAPON_TYPE = "stick-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeStick(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeStick(WEAPON_TYPE);
		return INSTANCE;
	}

}
