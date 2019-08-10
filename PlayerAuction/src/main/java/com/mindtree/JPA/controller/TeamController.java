package com.mindtree.JPA.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.JPA.entity.Player;
import com.mindtree.JPA.exceptions.ServiceException;
import com.mindtree.JPA.service.TeamService;
import com.mindtree.JPA.service.serviceimpl.TeamServiceImpl;

@RestController
public class TeamController {
	@Autowired
	private TeamService teamService=new TeamServiceImpl();
	
	@GetMapping("/teams/players/{team_name}")
	public List<Player> getAllPlayersByTeam(@PathVariable String team_name){
		List<Player> listOfPlayersOfATeam=new ArrayList<Player>();
		try {
			int team_id=teamService.isTeamValid(team_name).getTeam_id();
			listOfPlayersOfATeam=teamService.getPlayersByTeam(team_id);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		} 
		return listOfPlayersOfATeam;
	}

}
