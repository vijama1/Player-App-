package com.mindtree.JPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue
	private int team_id;
	private String team_name;

	

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int team_id, String team_name) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", team_name=" + team_name + "]";
	}
	

}
