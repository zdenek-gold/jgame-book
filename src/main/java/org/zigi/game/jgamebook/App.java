package org.zigi.game.jgamebook;

import java.io.File;

import org.apache.log4j.Logger;
import org.zigi.game.jgamebook.exception.InvalidPlayerException;
import org.zigi.game.jgamebook.exception.SkillAlreadyExistException;
import org.zigi.game.jgamebook.exception.TooLowLevelException;
import org.zigi.game.jgamebook.skill.AnimalAffinitySkill;
import org.zigi.game.jgamebook.skill.HealingSkill;
import org.zigi.game.jgamebook.skill.MaskingSkill;
import org.zigi.game.jgamebook.skill.TrackingSkill;
import org.zigi.game.jgamebook.skill.WeaponMasterySkill;
import org.zigi.game.jgamebook.story.Story;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger LOG = Logger.getLogger(App.class);

	public static void main(String[] args) {

		LOG.info("--- Začátek vytváření příběhu ---");
		Story s = Story.getInstance(new File("story.json"));
		LOG.info(s);
		LOG.info("--- Konec vytváření příběhu ---");

		LOG.info("--- Začátek vytváření hráče ---");
		Player p = Player.getInstance("Zigi");
		try {
			p.addSkill(MaskingSkill.getInstance());
			p.addSkill(HealingSkill.getInstance());
			p.addSkill(AnimalAffinitySkill.getInstance());
			p.addSkill(WeaponMasterySkill.getInstance());
			p.addSkill(TrackingSkill.getInstance());
			LOG.info(p);
			LOG.info("--- Konec vytváření hráče ---");

			try {
				LOG.info("--- Začátek vytváření hry ---");
				Game g = Game.getInstance(p, s);
				LOG.info("Hra vytvořena");
				LOG.info(g);
				LOG.info("--- Konec vytváření hry ---");
			} catch (InvalidPlayerException ip) {
				LOG.error("Invalid player", ip);
			}
		} catch (TooLowLevelException ex) {
			LOG.error("Pro další schopnost nemáš dostatečnou úroveň!");
		} catch (SkillAlreadyExistException se) {
			LOG.error("Schopnost " + se.getSkill().getCode() + " již ovládáš!");
		}

	}
}
