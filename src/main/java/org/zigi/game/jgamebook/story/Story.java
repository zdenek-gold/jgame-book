package org.zigi.game.jgamebook.story;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zigi.game.jgamebook.model.StoryModel;
import org.zigi.game.jgamebook.util.Util;

public class Story {
	private static final Logger LOG = Logger.getLogger(Story.class);

	private Map<Integer, Chapter> chapters = new LinkedHashMap<Integer, Chapter>();
	private Chapter chapter;

	private Story() {

	}

	public static Story getInstance() {
		return new Story();
	}

	public static Story getInstance(String filename) {
		try {
			StoryModel model = (StoryModel) Util.fromJson(new FileReader(filename), StoryModel.class);
			Story story = new Story();
			return story;
		} catch (FileNotFoundException e) {
			LOG.error("Chyba při převodu z JSON na objekt", e);
		}
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
