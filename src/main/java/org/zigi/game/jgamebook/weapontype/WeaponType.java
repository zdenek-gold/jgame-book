package org.zigi.game.jgamebook.weapontype;

public abstract class WeaponType {
	protected String code;

	@Override
	public String toString() {
		return code;
	}

	public String getCode() {
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || (obj instanceof WeaponType) == false)
			return false;
		WeaponType w = (WeaponType) obj;
		return w.getCode().equals(getCode());
	}
}
