package g.dbz.cardgame.method;

import java.util.*;
import g.dbz.cardgame.entity.*;
import g.dbz.cardgame.entity.Combatant;
import g.dbz.cardgame.enumerator.*;

public class Phase1 {

	public static void draw(List<Card> hand) {
		Random r = new Random();
		int card = r.nextInt(100 + 1) + 1;
		if (card <= 12) {
			hand.add(new Card(CardType.CHARGE));
		} else if (card <= 24) {
			hand.add(new Card(CardType.BOOST));
		} else if (card <= 36) {
			hand.add(new Card(CardType.LUCK));
		} else if (card <= 48) {
			hand.add(new Card(CardType.FIELD));
		} else if (card <= 60) {
			hand.add(new Card(CardType.ITEM));
		} else if (card <= 72) {
			hand.add(new Card(CardType.BLANK));
		} else {
			hand.add(new Card(CardType.SPECIAL));
		}
	}

	public static void charge(Combatant combatant) {
		int die = Dice.roll(6);
		int currentKi = combatant.getBtlKi();
		int maxKi = combatant.getKi() * 10;

		if (die == 1) {
			if ((currentKi + 5) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 5);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else if (die == 2) {
			if ((currentKi + 10) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 10);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else if (die == 3) {
			if ((currentKi + 15) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 15);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else if (die == 4) {
			if ((currentKi + 20) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 20);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else if (die == 5) {
			if ((currentKi + 25) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 25);
			} else {
				combatant.setBtlKi(maxKi);
			}
		} else {
			if ((currentKi + 30) <= (maxKi)) {
				combatant.setBtlKi(currentKi + 30);
			} else {
				combatant.setBtlKi(maxKi);
			}
		}
	}

	public static void damage(Combatant inflicted) {
		// TODO: AOE damage
		int die = Dice.roll(20);
		int hp = inflicted.getHp();

		if (die == 1 || die == 6 || die == 11 || die == 16) {
			inflicted.setHp(hp - 1);
		} else if (die == 2 || die == 7 || die == 12 || die == 17) {
			inflicted.setHp(hp - 2);
		} else if (die == 3 || die == 8 || die == 13 || die == 18) {
			inflicted.setHp(hp - 3);
		} else if (die == 4 || die == 9 || die == 14 || die == 19) {
			inflicted.setHp(hp - 4);
		} else if (die == 5 || die == 10 || die == 15) {
			inflicted.setHp(hp - 5);
		} else {
			inflicted.setHp(hp - 12);
			System.out.println("CRITICAL HIT");
		}
	}
}
