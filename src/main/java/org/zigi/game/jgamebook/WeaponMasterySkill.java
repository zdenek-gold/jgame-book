package org.zigi.game.jgamebook;

public class WeaponMasterySkill extends Skill {
	private WeaponType weaponType = WeaponType.DAGGER;

	private WeaponMasterySkill(WeaponType type) {
		this.weaponType = type;
	}

	public static WeaponMasterySkill getInstance(WeaponType type) {
		return new WeaponMasterySkill(type);
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

}
