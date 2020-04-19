package g.dbz.cardgame.entity;

import g.dbz.cardgame.enumerator.*;

public class ComputerCharacter extends Character {

	private Level lvl;

	// TODO: random method which may start the CPU off with an item/items
	private Boolean equipped;

	public ComputerCharacter(String name, Level lvl, Integer str, Integer dex, Integer intel, Integer cha,
			Integer endr, Integer ki, Integer hp, Integer atk, Integer def, Integer spd, Integer btlKi, Art art,
			Color color, Species species, Morality morality) {
		super(name, str, dex, intel, cha, endr, ki, hp, atk, def, spd, btlKi, art, color, species, morality);
		this.lvl = lvl;
	}

	public Level getLvl() {
		return lvl;
	}

	public void setLvl(Level lvl) {
		this.lvl = lvl;
	}

	public Boolean getEquipped() {
		return equipped;
	}

	public void setEquipped(Boolean equipped) {
		this.equipped = equipped;
	}

	// DEMO GUY
	// ("CPU",Level.PLANET4,16,9,13,16,7,3,70,11,11,9,30,Art.SPACE,Color.NONE,Species.OTHER,Morality.EVIL);
}
