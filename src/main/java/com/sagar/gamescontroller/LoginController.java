package com.sagar.gamescontroller;

/**
 * @author Sagar
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends GamesController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
}