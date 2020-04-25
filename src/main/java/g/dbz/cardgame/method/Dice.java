package g.dbz.cardgame.method;

import java.util.*;

public class Dice {

//COIN
	public static Boolean coinToss() {
		return new Random().nextBoolean();
	}

//ROLL SINGLE
	public static Integer roll(Integer side) {
		return new Random().nextInt(side + 1) + 1;
	}

//ROLL MULTIPLE
	public static List<Integer> rollD4(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(4));
		}
		return rolls;
	}

	public static List<Integer> rollD6(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(6));
		}
		return rolls;
	}

	public static List<Integer> rollD8(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(8));
		}
		return rolls;
	}

	public static List<Integer> rollD10(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(10));
		}
		return rolls;
	}

	public static List<Integer> rollD12(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(12));
		}
		return rolls;
	}

	public static List<Integer> rollD20(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(20));
		}
		return rolls;
	}

	public static List<Integer> rollD100(Integer amount) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 1; i <= amount; ++i) {
			rolls.add(roll(100));
		}
		return rolls;
	}

}
