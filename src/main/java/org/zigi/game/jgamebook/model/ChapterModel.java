package org.zigi.game.jgamebook.model;

import java.util.ArrayList;
import java.util.List;

public class ChapterModel {
	private int number;
	private String text;
	private List<DecisionModel> decisions = new ArrayList<DecisionModel>();

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<DecisionModel> getDecisions() {
		return decisions;
	}

	public void setDecisions(List<DecisionModel> decisions) {
		this.decisions = decisions;
	}

}
