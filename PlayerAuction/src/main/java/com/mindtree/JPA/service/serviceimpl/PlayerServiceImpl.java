package com.mindtree.JPA.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.JPA.entity.Player;
import com.mindtree.JPA.entity.Team;
import com.mindtree.JPA.enums.Category;
import com.mindtree.JPA.exceptions.ServiceException;
import com.mindtree.JPA.exceptions.serviceExceptions.InvalidCategoryException;
import com.mindtree.JPA.exceptions.serviceExceptions.InvalidTeamException;
import com.mindtree.JPA.repository.PlayerRepository;
import com.mindtree.JPA.repository.TeamRepository;
import com.mindtree.JPA.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private TeamRepository teamRepository;

	@Override
	public Team isTeamValid(String team_name) throws ServiceException {
		Team team;
		try {
			team = teamRepository.getTeamByName(team_name);
			if (team == null) {
				throw new InvalidTeamException("Team Details Not Found");
			}
		} 
		catch (InvalidTeamException e) {
			throw new ServiceException(e);
		}
		
		return team;

	}

	@Override
	public void isCategoryValid(String category) throws ServiceException {
		try {
			if(!(category.equalsIgnoreCase(Category.AllRounder.toString()) || category.equalsIgnoreCase(Category.Batsmen.toString()) || category.equalsIgnoreCase(Category.Bowler.toString()))) {
				throw new InvalidCategoryException("Invalid category, please check your input");
			}
		} 
		catch (InvalidCategoryException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public void isABatsmen(int highestScore, String category) throws ServiceException {
		if(category.equalsIgnoreCase(Category.Batsmen.toString())) {
			if(highestScore<50 || highestScore>200) {
				throw new ServiceException("Invalid Input for scores,check your input again");
			}
		}

	}

	@Override
	public void isABowler(String bestFigures,String category,int highestScore) throws ServiceException {
		if(category.equalsIgnoreCase(Category.Bowler.toString())) {
			if(bestFigures.equals("") || highestScore<0) {
				throw new ServiceException("Invalid Input, check your data and try again");
			}
			
		}

	}

	@Override
	public void addPlayer(Player player) throws ServiceException {
		try {
			playerRepository.save(player);
		} 
		catch (Exception e) {
			throw new ServiceException("Error while adding the data");
		}
		
		
	}

	@Override
	public List<Player> getAllPlayers() {
		List<Player> players=playerRepository.findAll();
		System.out.println(players.size());
		return players;
	}

}
