package main;

import lists.FoodList;
import lists.IngredientList;

public class Meal {
	
	private String name;
	private String info;
	private FoodList foodList;
	private IngredientList ingredientList;
	
	public Meal(String name) {
		this.name = name;
	}
	
	public Meal foodList(FoodList foodList) {
		this.foodList = foodList;
		return this;
	}
	
	public Meal ingredientList(IngredientList ingredientList) {
		this.ingredientList = ingredientList;
		return this;
	}
	
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
	public FoodList getFoodList() {
		return foodList;
	}
	public void setFoodList(FoodList foodList) {
		this.foodList = foodList;
	}
	public IngredientList getIngredientList() {
		return ingredientList;
	}
	public void setIngredientList(IngredientList ingredientList) {
		this.ingredientList = ingredientList;
	}
	
	
	//AddFood
	public void addFood(Food food, double amount){
		Amount<Food> newFood = new Amount<Food>(food, amount);
		if(this.foodList == null)
			this.foodList = new FoodList();
		this.foodList.add(newFood);
	}
	
	//AddIngredient
	public void addIngredient(Ingredient ingredient, double amount) {
		Amount<Ingredient> newIngredient = new Amount<Ingredient>(ingredient, amount);
		if(this.ingredientList == null)
			this.ingredientList = new IngredientList();
		this.ingredientList.add(newIngredient);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meal [name=");
		builder.append(name);
		builder.append(", info=");
		builder.append(info);
		builder.append(", foodList=");
		builder.append(foodList);
		builder.append(", ingredientList=");
		builder.append(ingredientList);
		builder.append("]");
		return builder.toString();
	}
	
	
}
