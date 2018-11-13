package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeMall extends WeaponType {
	public static final String WEAPON_TYPE = "mall-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeMall(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeMall(WEAPON_TYPE);
		return INSTANCE;
	}

}
