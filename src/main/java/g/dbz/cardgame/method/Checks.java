package g.dbz.cardgame.method;

import java.util.*;
import g.dbz.cardgame.entity.*;
import g.dbz.cardgame.enumerator.*;

public class Checks {

	// TODO: FASTEST/WIN OR LOSS/ESCAPE SUCCESS

	public static String checkPhase(int phase) {
		if (phase == 1) {
			return "phase1";
		} else if (phase == 2) {
			return "phase2";
		} else {
			return "phase3";

		}
	}

	public static boolean checkEscape(Combatant p1, Attribute choice1, Combatant p2, Attribute choice2) {
		// TODO: each failed escape cuts chances in half; opponent less than
		// 20% HP, +1 to player's roll

		List<Integer> rolls = Dice.rollD6(2);
		int roll1 = rolls.indexOf(0);
		int roll2 = rolls.indexOf(1);

		if (choice1.equals(choice2)) {
			roll1 = roll1 / 2;
		}
		modify(p1, choice1, roll1);
		modify(p2, choice2, roll2);

		if (roll1 > roll2) {
			return true;
		} else if (roll1 < roll2) {
			return false;
		} else {
			if (Dice.coinToss()) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static void modify(Combatant combatant, Attribute attribute, int roll) {
		int mod = 0;

		switch (attribute) {
		case STR:
			mod = (int) (combatant.getStr() * .15);
			break;
		case DEX:
			mod = (int) (combatant.getDex() * .15);
			break;
		case INTEL:
			mod = (int) (combatant.getIntel() * .15);
			break;
		case CHA:
			mod = (int) (combatant.getCha() * .15);
			break;
		case ENDR:
			mod = (int) (combatant.getEndr() * .15);
			break;
		case KI:
			mod = (int) (combatant.getKi() * .15);
			break;
		}
		roll += mod;
	}
}
