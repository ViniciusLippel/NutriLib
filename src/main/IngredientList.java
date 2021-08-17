package main;

import java.util.ArrayList;

public class IngredientList {
	
	private ArrayList<Amount<Ingredient>> ingredientList;
	
	public IngredientList() {
		this.ingredientList = new ArrayList<Amount<Ingredient>>();
	}
	
	public IngredientList(ArrayList<Amount<Ingredient>> ingredientList) {
		this.ingredientList = ingredientList;
	}
	
	//Getters & Setters
	public ArrayList<Amount<Ingredient>> getIngredientList() {
		return ingredientList;
	}
	public void setIngredientList(ArrayList<Amount<Ingredient>> ingredientList) {
		this.ingredientList = ingredientList;
	}
	
	
	//Add
	public void add(Amount<Ingredient> ingredient) {
		Amount<Ingredient> ingInList = searchByName(ingredient.getObject().getName());
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IngredientList [ingredientList=");
		builder.append(ingredientList);
		builder.append("]");
		return builder.toString();
	}
	
	
}
