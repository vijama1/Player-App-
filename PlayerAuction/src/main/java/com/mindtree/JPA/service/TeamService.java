package com.mindtree.JPA.service;

import java.util.List;

import com.mindtree.JPA.entity.Player;
import com.mindtree.JPA.entity.Team;
import com.mindtree.JPA.exceptions.ServiceException;

public interface TeamService {
	public Team isTeamValid(String team_name) throws ServiceException;
	public List<Player> getPlayersByTeam(int team_id) throws ServiceException;

}
