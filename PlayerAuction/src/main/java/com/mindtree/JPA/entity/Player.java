package com.mindtree.JPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private int player_no;
	private String player_name;
	private String category;
	private int highestScore;
	private String bestFigure;
	
	@ManyToOne
	private Team team;
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Player() {
		super();
	}
	public Player(int player_no, String player_name, String category, int highestScore, String bestFigure) {
		super();
		this.player_no = player_no;
		this.player_name = player_name;
		this.category = category;
		this.highestScore = highestScore;
		this.bestFigure = bestFigure;
	}
	public int getPlayer_no() {
		return player_no;
	}
	public void setPlayer_no(int player_no) {
		this.player_no = player_no;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	public String getBestFigure() {
		return bestFigure;
	}
	public void setBestFigure(String bestFigure) {
		this.bestFigure = bestFigure;
	}
	@Override
	public String toString() {
		return "Player [player_no=" + player_no + ", player_name=" + player_name + ", category=" + category
				+ ", highestScore=" + highestScore + ", bestFigure=" + bestFigure + "]";
	}
	

}
