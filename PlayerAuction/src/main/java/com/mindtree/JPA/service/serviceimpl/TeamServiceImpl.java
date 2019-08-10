package com.mindtree.JPA.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.JPA.entity.Player;
import com.mindtree.JPA.entity.Team;
import com.mindtree.JPA.exceptions.ServiceException;
import com.mindtree.JPA.exceptions.serviceExceptions.DataNotFetchedException;
import com.mindtree.JPA.exceptions.serviceExceptions.InvalidTeamException;
import com.mindtree.JPA.repository.PlayerRepository;
import com.mindtree.JPA.repository.TeamRepository;
import com.mindtree.JPA.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Team isTeamValid(String team_name) throws ServiceException {
		Team team;
		try {
			team = teamRepository.getTeamByName(team_name);
			if (team==null) {
				throw new InvalidTeamException("Team Details Not Found");
			}
		} 
		catch (InvalidTeamException e) {
			throw new ServiceException(e);
		}
		
		return team;

	}

	@Override
	public List<Player> getPlayersByTeam(int team_id) throws ServiceException {
		try {
			List<Player> playersOfATeam=playerRepository.getPlayersByTeam(team_id);
			if(playersOfATeam.size()==0) {
				throw new DataNotFetchedException("No Players found of this team");
			}
			return playersOfATeam;
		} catch (DataNotFetchedException e) {
			throw new ServiceException(e);
		}
		
	}

}
