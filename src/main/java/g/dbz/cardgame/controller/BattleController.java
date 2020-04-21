package g.dbz.cardgame.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import g.dbz.cardgame.entity.*;
import g.dbz.cardgame.enumerator.*;
import g.dbz.cardgame.method.*;

@Controller
public class BattleController {

//TEMP OBJECTS TO TEST GAME
	private CpuCombatant cpu = new CpuCombatant("CPU", Level.PLANET4, 16, 9, 13, 16, 7, 3, 70, 11, 11, 9, 30, Art.SPACE,
			Color.COLORLESS, Species.OTHER, Morality.EVIL);
	private PlayerCombatant player = new PlayerCombatant("Player", 0L, 18, 15, 1, 17, 11, 17, 110, 16, 14, 12, 170,
			Art.TURTLE, Color.RED, Species.SAIYAN, Morality.NEUTRAL);
//	

	public int phase = 1;

	@RequestMapping("/battle")
	public ModelAndView battle() {
		return new ModelAndView(Checks.checkPhase(phase));
	}

	@PostMapping("/battle")
	public ModelAndView battle(Choice choice) {

		ModelAndView mv = new ModelAndView("summary");
		choose(choice);

		return mv;
	}

	// TODO: void abstract method in Choice Enum?(to encapsulate choice
	// methods and clean up controller method)
	public void choose(Choice choice) {
		switch (choice) {
		// PHASE 1
		case DRAW:
			List<Card> pCards = player.getCards();
			Phase1.draw(pCards);
			player.setCards(pCards);
			break;
		case CHARGE:
			Phase1.charge(player);
			break;
		case DAMAGE:
			Phase1.damage(cpu);
			break;
		// PHASE 2
		case ACTIVATE:
			break;
		case USE:
			break;
		case NOTHING:
			break;
		// PHASE 3
		case QUICK:
			break;
		case HEAVY:
			break;
		case KI:
			break;
		case RUSH:
			break;
		case BLOCK:
			break;
		case DODGE:
			break;
		case COUNTER:
			break;
		case BURST:
			break;
		case OBSERVE:
			break;
		case TRUECHARGE:
			break;
		case TAUNT:
			break;
		case TRANSFORM:
			break;
		// ANY TIME
		case ESCAPE:
			break;
		}
	}
}
