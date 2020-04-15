package g.dbz.cardgame.entity;

public class Item {

	private String name;
	private Boolean passiveAbility;
	private Boolean consumableAbility;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getPassiveAbility() {
		return passiveAbility;
	}

	public void setPassiveAbility(Boolean passiveAbility) {
		this.passiveAbility = passiveAbility;
	}

	public Boolean getConsumableAbility() {
		return consumableAbility;
	}

	public void setConsumableAbility(Boolean consumableAbility) {
		this.consumableAbility = consumableAbility;
	}

}
