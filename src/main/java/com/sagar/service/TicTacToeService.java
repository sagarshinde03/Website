package com.sagar.service;

/**
 * @author Sagar
 */

import java.util.List;

import com.sagar.model.TicTacToe;
import com.sagar.model.TicTacToe_Username_Difficulty;

public interface TicTacToeService {
	void addGameResult(TicTacToe ticTacToe);
	void editGameResult(TicTacToe ticTacToe);
	TicTacToe getRecord(TicTacToe_Username_Difficulty ticTacToe_Username_Difficulty);
	TicTacToe getNextGameState(TicTacToe ticTacToe);
	List<TicTacToe> getScores(String username);
}