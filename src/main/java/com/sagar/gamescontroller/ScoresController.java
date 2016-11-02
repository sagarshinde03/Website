package com.sagar.gamescontroller;

/**
 * @author Sagar
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.model.TicTacToe;
import com.sagar.service.TicTacToeService;

@Controller
public class ScoresController extends GamesController {
	@Autowired
	private TicTacToeService ticTacToeService;

	@RequestMapping(value="/scores", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelandview = new ModelAndView("scores");
		return modelandview;
	}
	
	@RequestMapping(value="/scores/ticTacToe", method=RequestMethod.GET)
	protected ModelAndView getTicTacToeScores() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			ModelAndView modelandview = new ModelAndView("ticTacToeScores");
			List<TicTacToe> scores = ticTacToeService.getScores(userDetails.getUsername());
			for(TicTacToe record:scores){
				record.setLevelDifficulty(record.getTicTacToe_Username_Difficulty().getTicTacToeDifficulty().name());
				record.setTies(record.getGamesPlayed()-record.getWins()-record.getLosses());
			}
			modelandview.addObject("ticTacToeList", scores);
			return modelandview;
		}
		return null;
	}
}