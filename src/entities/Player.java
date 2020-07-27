package entities;

import java.util.List;
import java.util.ArrayList;

import entities.Mission;

public class Player {
	private String name;
	private Integer playerLevel;
	private Double gold;
	
	private List<Mission> missions = new ArrayList<>();
	
	public Player() {
		
	}

	public Player(String name, Integer playerLevel, Double gold) {
		this.name = name;
		this.playerLevel = playerLevel;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(Integer playerLevel) {
		this.playerLevel = playerLevel;
	}

	public Double getGold() {
		return gold;
	}

	public void setGold(Double gold) {
		this.gold = gold;
	}
	
	public List<Mission> getMission() {
		return missions;
	}
	
	public void addMission(Mission mission) {
		missions.add(mission);
	}
	
	public void removeMission(Mission mission) {
		missions.remove(mission);
	}
}
