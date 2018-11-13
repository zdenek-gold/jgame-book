package org.zigi.game.jgamebook.story;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Story {
	private Map<Integer, Chapter> chapters = new LinkedHashMap<Integer, Chapter>();
	private Chapter chapter;

	private Story() {

	}

	public static Story getInstance(File filename) {
		return null;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public boolean isValid() {
		if (chapters.isEmpty())
			return false;
		return true;
	}

	public List<Chapter> getChapters() {
		List<Chapter> result = new ArrayList<Chapter>();
		result.addAll(chapters.values());
		return result;
	}

	public void addChapters(List<Chapter> chapters) {
		for (Chapter ch : chapters)
			this.chapters.put(ch.getNumber(), ch);
	}
}
