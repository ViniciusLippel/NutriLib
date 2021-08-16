package main;

public class Meal {
	
	private String name;
	private String info;
	private FoodList foodList;
	private IngredientList ingredientList;
	
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
	
	
}
