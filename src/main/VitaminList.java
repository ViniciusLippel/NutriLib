package main;

import java.util.ArrayList;
/**
 * 
 * @author Vinicius Lippel
 *
 */
public class VitaminList {
	
	private ArrayList<Amount<Vitamin>> vitaminList;
	
	public VitaminList() {
		this.vitaminList = new ArrayList<Amount<Vitamin>>();
	}
	
	public VitaminList(ArrayList<Amount<Vitamin>> vitaminList) {
		this.vitaminList = vitaminList;
	}
	
	
	//Getters & Setters
	public ArrayList<Amount<Vitamin>> getVitaminList() {
		return vitaminList;
	}

	public void setVitaminList(ArrayList<Amount<Vitamin>> vitaminList) {
		this.vitaminList = vitaminList;
	}
	
	
	//Add
	public void add(Amount<Vitamin> vitamin) {
		this.vitaminList.add(vitamin);
	}
	
	//Sum VitaminList
	//public 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VitaminList [vitaminList=");
		builder.append(vitaminList);
		builder.append("]");
		return builder.toString();
	}
	
}
