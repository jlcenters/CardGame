package g.dbz.cardgame.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class GameController {

//FOR COPYPASTE PURPOSES
//	@RequestMapping("/")
//	public ModelAndView mainMenu() {
//		return new ModelAndView("home");
//	}

	@RequestMapping("/")
	public ModelAndView mainMenu() {
		return new ModelAndView("home");
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@PostMapping("/login")
	public ModelAndView login(@RequestParam("uname") String uname, @RequestParam("pass") String pass) {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/create")
	public ModelAndView create() {
		return new ModelAndView("create");
	}

	@PostMapping("/create")
	public ModelAndView create(@RequestParam("uname") String uname, @RequestParam("pass1") String pass1,
			@RequestParam("pass2") String pass2) {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/battle")
	public ModelAndView battle() {
		return new ModelAndView("battle");
	}
}
