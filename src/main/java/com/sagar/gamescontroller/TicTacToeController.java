package com.sagar.gamescontroller;

/**
 * @author Sagar
 */

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.model.TicTacToe;
import com.sagar.model.TicTacToeDifficulty;
import com.sagar.model.TicTacToe_Username_Difficulty;
import com.sagar.service.TicTacToeService;

@Controller
public class TicTacToeController extends GamesController {
	@Autowired
	private TicTacToeService ticTacToeService;

	@RequestMapping(value="/home/ticTacToe", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelandview = new ModelAndView("ticTacToe");
		return modelandview;
	}

	@RequestMapping(value="/home/ticTacToe/nextMove", method=RequestMethod.POST)
	@ResponseBody
	protected TicTacToe getNextMove(
			@RequestParam("difficulty") String difficulty,
			@Valid
			@ModelAttribute("ticTacToe") TicTacToe ticTacToe,
			BindingResult result
			) {
		if(difficulty.equals("easy")){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			if (!(auth instanceof AnonymousAuthenticationToken)) {
				UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				ticTacToe.setTicTacToe_Username_Difficulty(new TicTacToe_Username_Difficulty(userDetails.getUsername(), TicTacToeDifficulty.EASY));
			}
		}
		else if(difficulty.equals("hard")){
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			if (!(auth instanceof AnonymousAuthenticationToken)) {
				UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				ticTacToe.setTicTacToe_Username_Difficulty(new TicTacToe_Username_Difficulty(userDetails.getUsername(), TicTacToeDifficulty.HARD));
			}
		}
		return ticTacToeService.getNextGameState(ticTacToe);
	}
}