package g.dbz.cardgame.entity;

import g.dbz.cardgame.enumerator.*;

public class PlayerCharacter extends Character {

	// private User userCreator;
	private Long xp;

	public PlayerCharacter(String name, Long xp, Integer str, Integer dex, Integer intel, Integer cha, Integer endr,
			Integer ki, Integer hp, Integer atk, Integer def, Integer spd, Integer btlKi, Art art, Color color,
			Species species, Morality morality) {
		super(name, str, dex, intel, cha, endr, ki, hp, atk, def, spd, btlKi, art, color, species, morality);
		this.xp = xp;
	}

	public Long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}

//DEMO GUY ("Player",0L,18,15,1,17,11,17,110,16,14,12,170,Art.TURTLE,Color.RED,Species.SAIYAN,Morality.NEUTRAL);
}
