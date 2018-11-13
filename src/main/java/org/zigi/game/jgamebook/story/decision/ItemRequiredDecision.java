package org.zigi.game.jgamebook.story.decision;

import org.zigi.game.jgamebook.Player;
import org.zigi.game.jgamebook.item.IItem;

public class ItemRequiredDecision extends Decision {

	private IItem item;

	public ItemRequiredDecision(Player player) {
		super(player);
	}

	public IItem getItem() {
		return item;
	}

	public void setItem(IItem item) {
		this.item = item;
	}

	@Override
	public boolean isActive() {
		if (player.getBag().contains(item))
			return true;
		return false;
	}

}
