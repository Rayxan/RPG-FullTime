package entities;

public class PlayerStats {
	private String playerClass;
	private String race;
	private Integer completedMissionsP;
	private Integer completedMissionsS;
	
	public PlayerStats() {
		
	}

	public PlayerStats(String playerClass, String race, Integer completedMissionsP, Integer completedMissionsS) {
		this.playerClass = playerClass;
		this.race = race;
		this.completedMissionsP = completedMissionsP;
		this.completedMissionsS = completedMissionsS;
	}

	public String getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Integer getCompletedMissionsP() {
		return completedMissionsP;
	}

	public void setCompletedMissionsP(Integer completedMissionsP) {
		this.completedMissionsP = completedMissionsP;
	}

	public Integer getCompletedMissionsS() {
		return completedMissionsS;
	}

	public void setCompletedMissionsS(Integer completedMissionsS) {
		this.completedMissionsS = completedMissionsS;
	}
}
