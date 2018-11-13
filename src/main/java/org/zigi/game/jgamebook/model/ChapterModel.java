package org.zigi.game.jgamebook.model;

import java.util.ArrayList;
import java.util.List;

public class ChapterModel {
	private int number;
	private String text;
	private List<DecisionModel> decisions = new ArrayList<DecisionModel>();
}
