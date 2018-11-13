package org.zigi.game.jgamebook.model;

public class GoldUpdateModel extends UpdateModel {
	private int change = 0;

	public GoldUpdateModel(int change) {
		this.change = change;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

}
