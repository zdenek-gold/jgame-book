package org.zigi.game.jgamebook.weapon;

import java.awt.Image;

import org.zigi.game.jgamebook.weapontype.WeaponType;
import org.zigi.game.jgamebook.weapontype.WeaponTypeDagger;

public class Dagger extends Weapon {
	private static Image IMAGE = null;
	private static String NAME = "dagger";

	private Dagger() {
		super();
	}

	public static Dagger getInstance() {
		return new Dagger();
	}

	@Override
	public String toString() {
		return "Dagger";
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public Image getImage() {
		return IMAGE;
	}

	@Override
	public String getCode() {
		return WeaponTypeDagger.WEAPON_TYPE;
	}

	@Override
	public WeaponType getType() {
		return WeaponTypeDagger.getInstance();
	}

	public static void setImage(Image image) {
		Dagger.IMAGE = image;
	}

	public static void setName(String name) {
		Dagger.NAME = name;
	}

}
