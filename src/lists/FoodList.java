package lists;

import java.util.ArrayList;

import main.Amount;
import main.Food;


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
		Amount<Food> inList = searchByName(food.getObject().getName());
		if(inList == null)
			this.foodList.add(food);
		else {
			int i = this.foodList.indexOf(inList);
			double sum = this.foodList.get(i).getAmount() + food.getAmount();
			this.foodList.get(i).setAmount(sum);
		}
	}
	
	
	//Search by name
	public Amount<Food> searchByName(String name){
		for(int i=0; i<this.foodList.size(); i++) {
			if(this.foodList.get(i).getObject().getName() == name)
				return this.foodList.get(i);
		}
		return null;
	}
	
	
	//Sum FoodList
	public void sum(FoodList foodList) {
		for(int i=0; i<foodList.getFoodList().size(); i++) {
			this.foodList.add(foodList.getFoodList().get(i));
		}
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
