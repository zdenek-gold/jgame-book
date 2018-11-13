package org.zigi.game.jgamebook.item;

public class HealingPoison implements IBagItem {
	public static final String HEALING_POISON_CODE = "healing-poison";

	@Override
	public String toString() {
		return "Healing poison";
	}

	public String getCode() {
		return HEALING_POISON_CODE;
	}

}
