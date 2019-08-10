package com.mindtree.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.JPA.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
	@Query("FROM Team WHERE team_name = ?1")
	Team getTeamByName(String team_name);
	

}
