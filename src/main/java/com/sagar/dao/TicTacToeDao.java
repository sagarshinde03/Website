package com.sagar.dao;

/**
 * @author Sagar
 */

import java.util.List;

import com.sagar.model.TicTacToe;
import com.sagar.model.TicTacToe_Username_Difficulty;

public interface TicTacToeDao {
	void addGameResult(TicTacToe ticTacToe);
	void editGameResult(TicTacToe ticTacToe);
	TicTacToe getRecord(TicTacToe_Username_Difficulty ticTacToe_Username_Difficulty);
	List<TicTacToe> getScores(String username);
}
