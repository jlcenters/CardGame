package g.dbz.cardgame.controller;

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
		// FASTEST FIRST
		choose(choice);

		return mv;
	}

	// TODO: void abstract method in Choice Enum?(to encapsulate choice
	// methods and clean up controller method)
	public void choose(Choice choice) {
		switch (choice) {
		// PHASE 1
		case DRAW:
			System.out.println("Card Drawn!");
			Phase1.draw(player.getCards());
			break;
		case CHARGE:
			System.out.println(player.getName() + " charged their ki!");
			Phase1.charge(player);
			break;
		case DAMAGE:
			System.out.println(player.getName() + " damaged " + cpu.getName() + ".");
			Phase1.damage(cpu);
			break;
		// PHASE 2
		case ACTIVATE:
			System.out.println("Card Activated!");
			Phase2.activateCard(player, new Card(CardType.CHARGE));
			break;
		case USE:
			System.out.println("Item Used!");
			Phase2.useItem();
			break;
		case NOTHING:
			System.out.println("Nothing could be done.");
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
			if (Checks.checkEscape(player, Attribute.INTEL, cpu, Attribute.DEX)) {
			}
			break;
		}

	}
}
