package org.zigi.game.jgamebook.model;

import java.util.ArrayList;
import java.util.List;

import org.zigi.game.jgamebook.story.Chapter;

public class StoryModel {
	private List<Chapter> chapters = new ArrayList<Chapter>();
	private int startNumber;

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public int getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}
}
