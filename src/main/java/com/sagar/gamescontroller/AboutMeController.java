package com.sagar.gamescontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Sagar
 */

@Controller
public class AboutMeController extends GamesController{
	@RequestMapping(value="/about-me", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelAndView = new ModelAndView("about-me");
		return modelAndView;
	}
}