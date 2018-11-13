package org.zigi.game.jgamebook.weapon;

import java.awt.Image;

import org.zigi.game.jgamebook.item.ICarryInHand;
import org.zigi.game.jgamebook.weapontype.WeaponType;

public abstract class Weapon implements ICarryInHand {
	protected static int index = 0;

	private int id;

	protected Weapon() {
		this.id = index++;
	}

	public abstract String getName();

	public abstract Image getImage();

	public abstract String getCode();

	public abstract WeaponType getType();

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || (obj instanceof Weapon) == false)
			return false;
		Weapon w = (Weapon) obj;
		return w.getId() == getId();
	}
}
