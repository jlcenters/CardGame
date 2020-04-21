package g.dbz.cardgame.method;

import g.dbz.cardgame.entity.Combatant;

public class Checks {

	// TODO: FASTEST/HP/WIN OR LOSS/ESCAPE SUCCESS

	public static String checkPhase(int phase) {
		if (phase == 1) {
			return "phase1";
		} else if (phase == 2) {
			return "phase2";
		} else {
			return "phase3";

		}
	}

	public void checkFastest() {

	}

	public static boolean checkHp(Combatant combatant) {
		if (combatant.getHp() <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean checkWin() {
		return false;
	}

	public static boolean checkEscape() {
		return false;
	}
}
