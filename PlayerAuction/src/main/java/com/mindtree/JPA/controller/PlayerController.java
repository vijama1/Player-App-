package com.mindtree.JPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mindtree.JPA.entity.Player;
import com.mindtree.JPA.exceptions.ServiceException;
import com.mindtree.JPA.service.PlayerService;

@Controller
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("/players")
	public String getAllTracks(ModelMap model) {

		model.addAttribute("players", this.playerService.getAllPlayers());

		return "player";
	}

	@PostMapping("/players/add")
	public String addPlayer(ModelMap model, @ModelAttribute Player player) {

		try {
			System.out.println(player.getTeam());
			playerService.isTeamValid(player.getTeam().getTeam_name());
			player.setTeam(playerService.isTeamValid(player.getTeam().getTeam_name()));
			playerService.isCategoryValid(player.getCategory());
			playerService.isABatsmen(player.getHighestScore(), player.getCategory());
			playerService.isABowler(player.getBestFigure(), player.getCategory(), player.getHighestScore());
			playerService.addPlayer(player);
			return "redirect:/players";
		} catch (ServiceException e) {
			model.addAttribute("message", e.getMessage());
			return "error";
		}

	}

}
