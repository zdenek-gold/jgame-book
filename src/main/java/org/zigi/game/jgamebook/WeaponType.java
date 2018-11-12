package org.zigi.game.jgamebook;

public enum WeaponType {
	DAGGER("dagger"), SPEAR("spear"), MALL("mall"), SHORT_SWORD("short-sword"), WAR_HAMMER("war-hammer"),
	SWORD("sword"), STICK("stick"), LONG_SWORD("long-sword");

	private String code;

	private WeaponType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
