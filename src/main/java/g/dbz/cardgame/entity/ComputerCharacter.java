package g.dbz.cardgame.entity;

public class ComputerCharacter extends Character {

	private String lvl;
	private Boolean equipped;

	public String getLvl() {
		return lvl;
	}

	public void setLvl(String lvl) {
		this.lvl = lvl;
	}

	public Boolean getEquipped() {
		return equipped;
	}

	public void setEquipped(Boolean equipped) {
		this.equipped = equipped;
	}

	public ComputerCharacter(String name) {
		this.name = name;
	}
}
