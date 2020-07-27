package entities;

import entities.enums.ItemType;

public class Item {
	private String name;
	private ItemType itemTp;
	
	public Item() {
		
	}

	public Item(String name, ItemType itemTp) {
		super();
		this.name = name;
		this.itemTp = itemTp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemType getItemTp() {
		return itemTp;
	}

	public void setItemTp(ItemType itemTp) {
		this.itemTp = itemTp;
	}
}
