package entities;

public class Bars {
	private Integer helthBar;
	private Integer xpBar;
	
	public Bars() {
		
	}

	public Bars(Integer helthBar, Integer xpBar) {
		this.helthBar = helthBar;
		this.xpBar = xpBar;
	}

	public Integer getHelthBar() {
		return helthBar;
	}

	public void setHelthBar(Integer helthBar) {
		this.helthBar = helthBar;
	}

	public Integer getXpBar() {
		return xpBar;
	}

	public void setXpBar(Integer xpBar) {
		this.xpBar = xpBar;
	}
}
