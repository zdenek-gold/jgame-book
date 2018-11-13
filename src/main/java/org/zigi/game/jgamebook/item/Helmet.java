package org.zigi.game.jgamebook.item;

public class Helmet implements ISpecialItem, ICarryInBody {
	public static final String HELMET_CODE = "helmet";

	@Override
	public String toString() {
		return "Helmet";
	}

	public String getCode() {
		return HELMET_CODE;
	}

}
