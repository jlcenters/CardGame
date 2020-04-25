package g.dbz.cardgame.method;

import g.dbz.cardgame.entity.*;

public class Phase2 {

	// TODO: ACTIVATE CARD/CONSUME ITEM

	public static void activateCard(Combatant combatant, Card card) {
		switch (card.getType()) {
		case CHARGE:
			System.out.println(combatant.getName() + " activated a card to charge their ki!");
			activateCharge(combatant);
			break;
		case BOOST:
			System.out.println(combatant.getName() + " activated a boost card!");
			activateBoost(combatant);
			break;
		case SPECIAL:
			activateSpecial();
			break;
		case FIELD:
			activateField();
			break;
		case LUCK:
			activateLuck();
			break;
		case ITEM:
			activateItem();
			break;
		case BLANK:
			System.out.println("Nothing Happened!");
			break;
		}
	}

	public static void useItem() {

	}

	public static void activateCharge(Combatant combatant) {
		int die = Dice.roll(6);
		int currentKi = combatant.getBtlKi();
		int maxKi = combatant.getKi() * 10;

		if (die == 1) {
			if ((currentKi + 15) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 15);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else if (die == 2) {
			if ((currentKi + 30) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 30);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else if (die < 6) {
			if ((currentKi + 45) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 45);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else {
			if ((currentKi + 60) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 60);
			} else {
				combatant.setBtlKi(maxKi);
			}
		}
	}

	public static void activateBoost(Combatant combatant) {
		// TODO: boost duration
		int roll = Dice.roll(4);

		if (roll == 1) {

		} else if (roll == 2) {

		} else if (roll == 3) {

		} else {

		}
	}

	public static void activateSpecial() {

	}

	public static void activateField() {

	}

	public static void activateLuck() {

	}

	public static void activateItem() {

	}

}
