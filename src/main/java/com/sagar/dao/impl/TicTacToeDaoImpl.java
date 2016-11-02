package com.sagar.dao.impl;

/**
 * @author Sagar
 */

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sagar.dao.TicTacToeDao;
import com.sagar.model.TicTacToe;
import com.sagar.model.TicTacToe_Username_Difficulty;

@Repository
public class TicTacToeDaoImpl implements TicTacToeDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void addGameResult(TicTacToe ticTacToe) {
		ticTacToe = (TicTacToe) session.getCurrentSession().merge(ticTacToe);
		session.getCurrentSession().saveOrUpdate(ticTacToe);
	}

	@Override
	public void editGameResult(TicTacToe ticTacToe) {
		session.getCurrentSession().update(ticTacToe);
	}

	@Override
	public TicTacToe getRecord(TicTacToe_Username_Difficulty ticTacToe_Username_Difficulty) {
		return (TicTacToe) session.getCurrentSession().get(TicTacToe.class, ticTacToe_Username_Difficulty);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TicTacToe> getScores(String username) {
		return session.getCurrentSession().createQuery("from TicTacToe where username = '" + username + "'").list();
	}
}