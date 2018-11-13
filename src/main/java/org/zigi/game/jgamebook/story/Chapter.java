package org.zigi.game.jgamebook.story;

import java.util.ArrayList;
import java.util.List;

import org.zigi.game.jgamebook.story.decision.IDecision;

public class Chapter {
	private int number;
	private String text;
	private List<IDecision> decisions = new ArrayList<IDecision>();

	public Chapter(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addDecision(IDecision decision) {
		decisions.add(decision);
	}

	public List<IDecision> getValidDecisions() {
		List<IDecision> result = new ArrayList<IDecision>();
		for (IDecision d : decisions) {
			if (d.isActive())
				result.add(d);
		}
		return result;
	}

}
