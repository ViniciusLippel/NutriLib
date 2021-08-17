package main;

import java.util.ArrayList;

public class FoodList {
	
	private ArrayList<Amount<Food>> foodList;
	
	public FoodList() {
		this.foodList = new ArrayList<Amount<Food>>();
	}
	
	public FoodList(ArrayList<Amount<Food>> foodList) {
		this.foodList = foodList;
	}
	
	
	//Getters & Setters
	public ArrayList<Amount<Food>> getFoodList() {
		return foodList;
	}
	public void setFoodList(ArrayList<Amount<Food>> foodList) {
		this.foodList = foodList;
	}
	
	
	//Add
	public void add(Amount<Food> food) {
		this.foodList.add(food);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodList [foodList=");
		builder.append(foodList);
		builder.append("]");
		return builder.toString();
	}
	
	
}
