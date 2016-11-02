package com.sagar.model;

/**
 * @author Sagar
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class TicTacToe_Username_Difficulty implements Serializable {
	@Column
	private String username;
	@Enumerated(EnumType.STRING)
	@Column
	private TicTacToeDifficulty difficulty;
	
	public TicTacToe_Username_Difficulty(String username, TicTacToeDifficulty ticTacToeDifficulty) {
		super();
		this.username = username;
		this.difficulty = ticTacToeDifficulty;
	}
	
	public TicTacToe_Username_Difficulty(String username) {
		super();
		this.username = username;
	}
	
	public TicTacToe_Username_Difficulty() {
		super();
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public TicTacToeDifficulty getTicTacToeDifficulty() {
		return difficulty;
	}
	public void setTicTacToeDifficulty(TicTacToeDifficulty ticTacToeDifficulty) {
		this.difficulty = ticTacToeDifficulty;
	}
}
