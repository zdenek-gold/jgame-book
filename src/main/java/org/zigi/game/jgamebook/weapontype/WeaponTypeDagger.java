package org.zigi.game.jgamebook.weapontype;

public class WeaponTypeDagger extends WeaponType {

	public static final String WEAPON_TYPE = "dagger-type";
	private static WeaponType INSTANCE = null;

	private WeaponTypeDagger(String code) {
		super.code = code;
	}

	public static WeaponType getInstance() {
		if (INSTANCE == null)
			INSTANCE = new WeaponTypeDagger(WEAPON_TYPE);
		return INSTANCE;
	}

}
