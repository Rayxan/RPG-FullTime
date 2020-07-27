package entities;

import entities.enums.MissionLevel;

public class Mission {
	private String name;
	private MissionLevel level;
	private Integer missionTp;
	
	public Mission() {
		
	}

	public Mission(String name, MissionLevel level, Integer missionTp) {
		this.name = name;
		this.level = level;
		this.missionTp = missionTp;
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
	
	public Integer getMissionTp() {
		return missionTp;
	}
	
	public void setMissionTp (Integer missionTp) {
		this.missionTp = missionTp;
	}
}
