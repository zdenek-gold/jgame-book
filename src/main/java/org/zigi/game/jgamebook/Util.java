package org.zigi.game.jgamebook;

import java.security.SecureRandom;

public class Util {

	private static final SecureRandom RND = new SecureRandom();

	public static int randomValue(int bound) {
		return RND.nextInt(bound);
	}
}
