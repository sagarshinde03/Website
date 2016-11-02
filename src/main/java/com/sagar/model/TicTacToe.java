package com.sagar.model;

/**
 * @author Sagar
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class TicTacToe implements Serializable {
	@EmbeddedId
	private TicTacToe_Username_Difficulty ticTacToe_Username_Difficulty;
	@Column(nullable=false)
	private int gamesPlayed;
	@Column(nullable=false)
	private int wins;
	@Column(nullable=false)
	private int losses;
	@Transient
	private String message;
	@Transient
	private String box1;
	@Transient
	private String box2;
	@Transient
	private String box3;
	@Transient
	private String box4;
	@Transient
	private String box5;
	@Transient
	private String box6;
	@Transient
	private String box7;
	@Transient
	private String box8;
	@Transient
	private String box9;
	@Transient
	private String levelDifficulty;
	@Transient
	private int ties;
	
	public TicTacToe_Username_Difficulty getTicTacToe_Username_Difficulty() {
		return ticTacToe_Username_Difficulty;
	}
	public void setTicTacToe_Username_Difficulty(TicTacToe_Username_Difficulty ticTacToe_Username_Difficulty) {
		this.ticTacToe_Username_Difficulty = ticTacToe_Username_Difficulty;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getBox1() {
		return box1;
	}
	public void setBox1(String box1) {
		this.box1 = box1;
	}
	public String getBox2() {
		return box2;
	}
	public void setBox2(String box2) {
		this.box2 = box2;
	}
	public String getBox3() {
		return box3;
	}
	public void setBox3(String box3) {
		this.box3 = box3;
	}
	public String getBox4() {
		return box4;
	}
	public void setBox4(String box4) {
		this.box4 = box4;
	}
	public String getBox5() {
		return box5;
	}
	public void setBox5(String box5) {
		this.box5 = box5;
	}
	public String getBox6() {
		return box6;
	}
	public void setBox6(String box6) {
		this.box6 = box6;
	}
	public String getBox7() {
		return box7;
	}
	public void setBox7(String box7) {
		this.box7 = box7;
	}
	public String getBox8() {
		return box8;
	}
	public void setBox8(String box8) {
		this.box8 = box8;
	}
	public String getBox9() {
		return box9;
	}
	public void setBox9(String box9) {
		this.box9 = box9;
	}
	public String getLevelDifficulty() {
		return levelDifficulty;
	}
	public void setLevelDifficulty(String levelDifficulty) {
		this.levelDifficulty = levelDifficulty;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}
}