package org.zigi.game.jgamebook.story.decision;

import org.zigi.game.jgamebook.Player;

public class ChooseDecision extends Decision {

	public ChooseDecision(Player player) {
		super(player);
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
