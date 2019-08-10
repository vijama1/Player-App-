package com.mindtree.JPA.service;

import java.util.List;

import com.mindtree.JPA.entity.Player;
import com.mindtree.JPA.entity.Team;
import com.mindtree.JPA.exceptions.ServiceException;

public interface PlayerService {
	public Team isTeamValid(String team_name) throws ServiceException;
	public void isCategoryValid(String category) throws ServiceException;
	public void isABatsmen(int highestScore, String category) throws ServiceException;
	public void isABowler(String bestFigures,String category,int highestScore) throws ServiceException;
	public void addPlayer(Player player) throws ServiceException;
	public List<Player> getAllPlayers();

}
