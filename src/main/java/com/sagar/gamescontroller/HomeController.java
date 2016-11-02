package com.sagar.gamescontroller;

/**
 * @author Sagar
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends GamesController {
	@RequestMapping(value="/home", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelandview = new ModelAndView("home");
		return modelandview;
	}
}
