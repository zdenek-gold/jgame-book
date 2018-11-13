package org.zigi.game.jgamebook.item;

public class WiredVest implements ISpecialItem, ICarryInBody {
	public static final String WIRED_VEST_CODE = "wired-vest";

	@Override
	public String toString() {
		return "Wired vest";
	}

	public String getCode() {
		return WIRED_VEST_CODE;
	}

}
