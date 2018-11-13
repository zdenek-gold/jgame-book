package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeHammer extends WeaponType {
	public static final String WEAPON_TYPE = "hammer-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeHammer(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeHammer(WEAPON_TYPE);
		return INSTANCE;
	}

}
