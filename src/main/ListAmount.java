package main;

import java.util.ArrayList;

public class ListAmount<T> {
	
	ArrayList<Amount<T>> list;
	
	//Constructors
	public ListAmount() {
		this.list = new ArrayList<Amount<T>>();
	}
	
	public ListAmount(ArrayList<Amount<T>> list) {
		this.list = list;
	}
	
	
	//Getters & Setters
	//Add
	public void add(Amount<T> amount) {
		Amount<T> inList = searchByName(amount.getObject().getName());
		if(ingInList == null)
			this.ingredientList.add(ingredient);
		else {
			int i = this.ingredientList.indexOf(ingInList);
			double sum = this.ingredientList.get(i).getAmount() + ingredient.getAmount();
			this.ingredientList.get(i).setAmount(sum);
		}
	}
	
	public Amount<Ingredient> searchByName(String name){
		for(int i=0; i<this.ingredientList.size(); i++) {
			if(this.ingredientList.get(i).getObject().getName() == name)
				return this.ingredientList.get(i);
		}
		return null;
	}
}
