package org.zigi.game.jgamebook.util;

import java.io.FileReader;
import java.security.SecureRandom;

import com.google.gson.Gson;

public class Util {

	private static final SecureRandom RND = new SecureRandom();
	private static Gson GSON = new Gson();

	public static int randomValue(int bound) {
		return RND.nextInt(bound);
	}

	public static String toJson(Object o) {
		return GSON.toJson(o);
	}

	public static Object fromJson(FileReader file, Class<?> className) {
		return GSON.fromJson(file, className);
	}

}
