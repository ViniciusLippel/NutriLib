package main;

import lists.IngredientList;

public class Food {
	
	private String name;
	private String info;
	private IngredientList ingredientList;
	private NutriValue nutriValue;
	
	public Food(String name) {
		this.name = name;
	}
	
	public Food info(String info) {
		this.info = info;
		return this;
	}
	
	public Food ingredientList(IngredientList ingredientList) {
		this.ingredientList = ingredientList;
		return this;
	}
	
	public Food nutriValue(NutriValue nutriValue) {
		this.nutriValue = nutriValue;
		return this;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public IngredientList getIngredientList() {
		return ingredientList;
	}
	public void setIngredientList(IngredientList ingredientList) {
		this.ingredientList = ingredientList;
	}
	public NutriValue getNutriValue() {
		return nutriValue;
	}
	public void setNutriValue(NutriValue nutriValue) {
		this.nutriValue = nutriValue;
	}
	
	
	//Add Ingredient
	public void addIngredient(Ingredient ingredient, double amount) {
		Amount<Ingredient> newIngredient = new Amount<Ingredient>(ingredient, amount);
		if(this.ingredientList == null)
			this.ingredientList = new IngredientList();
		this.ingredientList.add(newIngredient);
	}
	
	
	//To String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food [name=");
		builder.append(name);
		builder.append(", info=");
		builder.append(info);
		builder.append(", ingredientList=");
		builder.append(ingredientList);
		builder.append(", nutriValue=");
		builder.append(nutriValue);
		builder.append("]");
		return builder.toString();
	}
	
}
