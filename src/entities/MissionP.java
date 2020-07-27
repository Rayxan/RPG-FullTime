package entities;

import entities.enums.MissionLevel;

public class MissionP {
	private String name;
	private MissionLevel level;
	
	public MissionP() {
		
	}

	public MissionP(String name, MissionLevel level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MissionLevel getLevel() {
		return level;
	}

	public void setLevel(MissionLevel level) {
		this.level = level;
	}
}
