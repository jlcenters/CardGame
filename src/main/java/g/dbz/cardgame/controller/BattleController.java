package g.dbz.cardgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import g.dbz.cardgame.entity.*;
import g.dbz.cardgame.enumerator.*;

@Controller
public class BattleController {

//TEMP OBJECTS TO TEST GAME
	private ComputerCharacter cpu = new ComputerCharacter("CPU", Level.PLANET4, 16, 9, 13, 16, 7, 3, 70, 11, 11, 9, 30,
			Art.SPACE, Color.COLORLESS, Species.OTHER, Morality.EVIL);
	private PlayerCharacter player = new PlayerCharacter("Player", 0L, 18, 15, 1, 17, 11, 17, 110, 16, 14, 12, 170,
			Art.TURTLE, Color.RED, Species.SAIYAN, Morality.NEUTRAL);
//	

	private int phase = 1;

	@RequestMapping("/battle")
	public ModelAndView battle() {
		if (phase == 1) {

		} else if (phase == 2) {

		} else if (phase == 3) {

		}
		return new ModelAndView("battle");
	}
}
