package lists;

import java.util.ArrayList;

import main.Amount;
import main.Mineral;

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
		Amount<Mineral> inList = searchByName(mineral.getObject().getName());
		if(inList == null)
			this.mineralList.add(mineral);
		else {
			int i = this.mineralList.indexOf(inList);
			double sum = this.mineralList.get(i).getAmount() + mineral.getAmount();
			this.mineralList.get(i).setAmount(sum);
		}
	}
	
	
	//Search by name
	public Amount<Mineral> searchByName(String name){
		for(int i=0; i<this.mineralList.size(); i++) {
			if(this.mineralList.get(i).getObject().getName() == name)
				return this.mineralList.get(i);
		}
		return null;
	}
	
	
	//Sum MineralList
	public void sum(MineralList mineralList) {
		for(int i=0; i<mineralList.getMineralList().size(); i++) {
			this.mineralList.add(mineralList.getMineralList().get(i));
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MineralList [mineralList=");
		builder.append(mineralList);
		builder.append("]");
		return builder.toString();
	}
}
