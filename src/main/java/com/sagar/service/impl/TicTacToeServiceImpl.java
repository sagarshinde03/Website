package com.sagar.service.impl;

/**
 * @author Sagar
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sagar.dao.TicTacToeDao;
import com.sagar.model.TicTacToe;
import com.sagar.model.TicTacToe_Username_Difficulty;
import com.sagar.service.TicTacToeService;

@Service
public class TicTacToeServiceImpl implements TicTacToeService {
	@Autowired
	private TicTacToeDao ticTacToeDao;

	@Transactional
	public void addGameResult(TicTacToe ticTacToe) {
		ticTacToeDao.addGameResult(ticTacToe);
	}

	@Transactional
	public void editGameResult(TicTacToe ticTacToe) {
		ticTacToeDao.editGameResult(ticTacToe);
	}
	
	@Transactional
	public TicTacToe getRecord(TicTacToe_Username_Difficulty ticTacToe_Username_Difficulty) {
		return ticTacToeDao.getRecord(ticTacToe_Username_Difficulty);
	}
	
	@Transactional
	public List<TicTacToe> getScores(String username) {
		return ticTacToeDao.getScores(username);
	}

	@Transactional
	public TicTacToe getNextGameState(TicTacToe ticTacToe) {
		String winner=checkWinner(ticTacToe);
		if(!winner.equals("")){
			if(winner.equals("X")) ticTacToe.setMessage("You win!!!");
			else ticTacToe.setMessage("Computer wins.");
			storeGameResult(ticTacToe, winner);
			return ticTacToe;
		}
		if(allBoxesOccupied(ticTacToe)){
			ticTacToe.setMessage("Game tied.");
			storeGameResult(ticTacToe, "");
			return ticTacToe;
		}
		setNextBox(ticTacToe);
		winner=checkWinner(ticTacToe);
		if(!winner.equals("")){
			if(winner.equals("X")) ticTacToe.setMessage("You win!!!");
			else ticTacToe.setMessage("Computer wins.");
			storeGameResult(ticTacToe, winner);
			return ticTacToe;
		}
		return ticTacToe;
	}
	
	// return "X" means user wins
	// return "O" means computer wins
	// return "" means game still going on or no winner
	private String checkWinner(TicTacToe ticTacToe){
		if(ticTacToe.getBox1().equals(ticTacToe.getBox2()) && ticTacToe.getBox1().equals(ticTacToe.getBox3())){
			return ticTacToe.getBox1();
		}
		if(ticTacToe.getBox4().equals(ticTacToe.getBox5()) && ticTacToe.getBox4().equals(ticTacToe.getBox6())){
			return ticTacToe.getBox4();
		}
		if(ticTacToe.getBox7().equals(ticTacToe.getBox8()) && ticTacToe.getBox7().equals(ticTacToe.getBox9())){
			return ticTacToe.getBox7();
		}
		if(ticTacToe.getBox1().equals(ticTacToe.getBox4()) && ticTacToe.getBox1().equals(ticTacToe.getBox7())){
			return ticTacToe.getBox1();
		}
		if(ticTacToe.getBox2().equals(ticTacToe.getBox5()) && ticTacToe.getBox2().equals(ticTacToe.getBox8())){
			return ticTacToe.getBox2();
		}
		if(ticTacToe.getBox3().equals(ticTacToe.getBox6()) && ticTacToe.getBox3().equals(ticTacToe.getBox9())){
			return ticTacToe.getBox3();
		}
		if(ticTacToe.getBox1().equals(ticTacToe.getBox5()) && ticTacToe.getBox1().equals(ticTacToe.getBox9())){
			return ticTacToe.getBox1();
		}
		if(ticTacToe.getBox3().equals(ticTacToe.getBox5()) && ticTacToe.getBox3().equals(ticTacToe.getBox7())){
			return ticTacToe.getBox3();
		}
		return "";
	}
	
	private boolean allBoxesOccupied(TicTacToe ticTacToe){
		if(!ticTacToe.getBox1().equals("")
			&& !ticTacToe.getBox2().equals("")
			&& !ticTacToe.getBox3().equals("")
			&& !ticTacToe.getBox4().equals("")
			&& !ticTacToe.getBox5().equals("")
			&& !ticTacToe.getBox6().equals("")
			&& !ticTacToe.getBox7().equals("")
			&& !ticTacToe.getBox8().equals("")
			&& !ticTacToe.getBox9().equals("")
		) return true;
		return false;
	}
	
	private void setNextBox(TicTacToe ticTacToe){
		ArrayList<Integer> vacantBoxes=getVacatBoxes(ticTacToe);
		Random r = new Random();
		int random = r.nextInt(vacantBoxes.size());
		random=vacantBoxes.get(random);
		if(random==1) ticTacToe.setBox1("O");
		if(random==2) ticTacToe.setBox2("O");
		if(random==3) ticTacToe.setBox3("O");
		if(random==4) ticTacToe.setBox4("O");
		if(random==5) ticTacToe.setBox5("O");
		if(random==6) ticTacToe.setBox6("O");
		if(random==7) ticTacToe.setBox7("O");
		if(random==8) ticTacToe.setBox8("O");
		if(random==9) ticTacToe.setBox9("O");
	}
	
	private ArrayList<Integer> getVacatBoxes(TicTacToe ticTacToe){
		ArrayList<Integer> vacantBoxes=new ArrayList<Integer>();
		if(ticTacToe.getBox1().equals("")) vacantBoxes.add(1);
		if(ticTacToe.getBox2().equals("")) vacantBoxes.add(2);
		if(ticTacToe.getBox3().equals("")) vacantBoxes.add(3);
		if(ticTacToe.getBox4().equals("")) vacantBoxes.add(4);
		if(ticTacToe.getBox5().equals("")) vacantBoxes.add(5);
		if(ticTacToe.getBox6().equals("")) vacantBoxes.add(6);
		if(ticTacToe.getBox7().equals("")) vacantBoxes.add(7);
		if(ticTacToe.getBox8().equals("")) vacantBoxes.add(8);
		if(ticTacToe.getBox9().equals("")) vacantBoxes.add(9);
		return vacantBoxes;
	}
	
	private void storeGameResult(TicTacToe ticTacToe, String winner){
		TicTacToe record=getRecord(ticTacToe.getTicTacToe_Username_Difficulty());
		if(record==null){
			if(winner.equals("X")){
				ticTacToe.setGamesPlayed(1);
				ticTacToe.setWins(1);
				ticTacToe.setLosses(0);
				ticTacToeDao.addGameResult(ticTacToe);
			} else if(winner.equals("O")){
				ticTacToe.setGamesPlayed(1);
				ticTacToe.setWins(0);
				ticTacToe.setLosses(1);
				ticTacToeDao.addGameResult(ticTacToe);
			} else {
				ticTacToe.setGamesPlayed(1);
				ticTacToe.setWins(0);
				ticTacToe.setLosses(0);
				ticTacToeDao.addGameResult(ticTacToe);
			}
		} else {
			if(winner.equals("X")){
				ticTacToe.setGamesPlayed(record.getGamesPlayed()+1);
				ticTacToe.setWins(record.getWins()+1);
				ticTacToe.setLosses(record.getLosses());
				ticTacToeDao.addGameResult(ticTacToe);
			} else if(winner.equals("O")){
				ticTacToe.setGamesPlayed(record.getGamesPlayed()+1);
				ticTacToe.setWins(record.getWins());
				ticTacToe.setLosses(record.getLosses()+1);
				ticTacToeDao.addGameResult(ticTacToe);
			} else {
				ticTacToe.setGamesPlayed(record.getGamesPlayed()+1);
				ticTacToe.setWins(record.getWins());
				ticTacToe.setLosses(record.getLosses());
				ticTacToeDao.addGameResult(ticTacToe);
			}
		}
	}
}