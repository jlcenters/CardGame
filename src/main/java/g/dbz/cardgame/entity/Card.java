package g.dbz.cardgame.entity;

import g.dbz.cardgame.enumerator.*;

public class Card {

	private CardType type;
	private Boolean activated;

	public Card(CardType type) {
		this.type = type;
		activated = false;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

}
