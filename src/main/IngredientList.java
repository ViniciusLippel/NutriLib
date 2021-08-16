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
		this.ingredientList.add(ingredient);
	}
}
