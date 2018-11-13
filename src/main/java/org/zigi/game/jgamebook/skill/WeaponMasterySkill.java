package org.zigi.game.jgamebook.skill;

import java.util.ArrayList;
import java.util.List;

import org.zigi.game.jgamebook.util.Util;
import org.zigi.game.jgamebook.weapontype.WeaponType;
import org.zigi.game.jgamebook.weapontype.WeaponTypeAxe;
import org.zigi.game.jgamebook.weapontype.WeaponTypeDagger;
import org.zigi.game.jgamebook.weapontype.WeaponTypeHammer;
import org.zigi.game.jgamebook.weapontype.WeaponTypeLongSword;
import org.zigi.game.jgamebook.weapontype.WeaponTypeMall;
import org.zigi.game.jgamebook.weapontype.WeaponTypeShortSword;
import org.zigi.game.jgamebook.weapontype.WeaponTypeSpear;
import org.zigi.game.jgamebook.weapontype.WeaponTypeStick;
import org.zigi.game.jgamebook.weapontype.WeaponTypeSword;

public class WeaponMasterySkill extends Skill {
	public static final String CODE = "weapon-mastery";
	public static String NAME;
	public static String DESCRIPTION;

	public static List<WeaponType> WEAPON_TYPES_CHANCE = new ArrayList<WeaponType>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7807460468637403210L;

		{
			add(WeaponTypeDagger.getInstance());
			add(WeaponTypeSpear.getInstance());
			add(WeaponTypeMall.getInstance());
			add(WeaponTypeShortSword.getInstance());
			add(WeaponTypeHammer.getInstance());
			add(WeaponTypeSword.getInstance());
			add(WeaponTypeAxe.getInstance());
			add(WeaponTypeSword.getInstance());
			add(WeaponTypeStick.getInstance());
			add(WeaponTypeLongSword.getInstance());
		}
	};

	private WeaponType weaponType;

	@Override
	public String toString() {
		return super.toString() + "(" + weaponType + ")";
	}

	protected WeaponMasterySkill() {
		int random = Util.randomValue(WEAPON_TYPES_CHANCE.size());
		this.weaponType = WEAPON_TYPES_CHANCE.get(random);
	}

	public static WeaponMasterySkill getInstance() {
		return new WeaponMasterySkill();
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	@Override
	public String getCode() {
		return CODE;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
