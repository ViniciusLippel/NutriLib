package main;

import java.util.ArrayList;

public class MineralList {
	
	private ArrayList<Amount<Mineral>> mineralList;
	
	
	public MineralList() {
		this.mineralList = new ArrayList<Amount<Mineral>>();
	}
	
	public MineralList(ArrayList<Amount<Mineral>> mineralList) {
		this.mineralList = mineralList;
	}
	
	
	//Getters & Setters
	public ArrayList<Amount<Mineral>> getMineralList() {
		return mineralList;
	}

	public void setMineralList(ArrayList<Amount<Mineral>> mineralList) {
		this.mineralList = mineralList;
	}
	
	
	//Add
	public void add(Amount<Mineral> mineral) {
		this.mineralList.add(mineral);
	}
	
}
