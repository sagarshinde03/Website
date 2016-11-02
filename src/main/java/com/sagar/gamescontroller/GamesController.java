package com.sagar.gamescontroller;

/**
 * @author Sagar
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/", method=RequestMethod.GET)
public class GamesController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelandview = new ModelAndView("welcome");
		return modelandview;
	}
}