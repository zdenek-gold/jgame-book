package org.zigi.game.jgamebook;

import java.awt.Image;

public class Weapon implements IBagItem, ICarryInHand {

	private String code;
	private String name;
	private Image image;

	public static Weapon getInstance(String code) throws CodeIsNotSetException {
		if (code == null || code.isEmpty())
			throw new CodeIsNotSetException();
		return new Weapon(code);
	}

	public static Weapon getInstance(String code, String name) throws CodeIsNotSetException {
		Weapon w = getInstance(code);
		w.setName(name);
		return w;
	}

	public static Weapon getInstance(String code, String name, Image image) throws CodeIsNotSetException {
		Weapon w = getInstance(code, name);
		w.setImage(image);
		return w;
	}

	public Weapon(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public Image getImage() {
		return image;
	}

	private void setImage(Image image) {
		this.image = image;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || (obj instanceof Weapon) == false)
			return false;
		Weapon w = (Weapon) obj;
		return code.equals(w.getCode());
	}
}
