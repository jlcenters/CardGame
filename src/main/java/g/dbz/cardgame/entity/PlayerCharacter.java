package g.dbz.cardgame.entity;

public class PlayerCharacter extends Character{

	// private User userCreator;
	private Long xp;

	public Long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}

	public PlayerCharacter(String name) {
		this.name = name;
	}
}
