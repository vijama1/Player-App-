package com.mindtree.JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.JPA.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
	@Query("FROM Player WHERE team_team_id = ?1")
	 List<Player> getPlayersByTeam(int team_id);
	

}
