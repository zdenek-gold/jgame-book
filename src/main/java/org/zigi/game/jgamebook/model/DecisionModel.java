package org.zigi.game.jgamebook.model;

import java.util.ArrayList;
import java.util.List;

public class DecisionModel {
	private int chapter;
	private List<UpdateModel> updates = new ArrayList<UpdateModel>();

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public List<UpdateModel> getUpdates() {
		return updates;
	}

	public void setUpdates(List<UpdateModel> updates) {
		this.updates = updates;
	}

}
