package entities;

import entities.enums.MapType;

public class Map {
	private String name;
	private MapType mapTp;
	
	public Map() {
		
	}

	public Map(String name, MapType mapTp) {
		this.name = name;
		this.mapTp = mapTp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MapType getMapTp() {
		return mapTp;
	}

	public void setMapTp(MapType mapTp) {
		this.mapTp = mapTp;
	}
}
