package tests;

import lists.IngredientList;
import main.*;

public class GeneralTest {

	public static void main(String[] args) {
		
		NutriValue nvBeans = new NutriValue(230, 110).fat(new Fat(8, 1, 0)).protein(3);
		Ingredient beans = new Ingredient("Beans", nvBeans);
		Amount<Ingredient> amBeans = new Amount<Ingredient>(beans, 500);
		
		NutriValue nvRice = new NutriValue(230, 100).carbs(200).fat(new Fat(2, 1, 0));
		Ingredient rice = new Ingredient("Rice", nvRice);
		Amount<Ingredient> amRice = new Amount<Ingredient>(rice, 300);
		
		IngredientList il = new IngredientList();
		il.add(amBeans);
		il.add(amRice);
		il.add(amBeans);
		
		Meal meal = new Meal("Rice and Beans").ingredientList(il);
		System.out.println(meal.toString());
		
		il.ad
	}

}
