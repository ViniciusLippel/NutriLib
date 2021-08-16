package main;


/**
 * 
 * @author Vinicius Lippel
 *
 */

public class Ingredient {
	
	private String name;
	private String info;
	private NutriValue nutriValue;
	
	public Ingredient(String name, NutriValue nutriValue) {
		this.name = name;
		this.nutriValue = nutriValue;
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
	public NutriValue getNutriValue() {
		return nutriValue;
	}
	public void setNutriValue(NutriValue nutriValue) {
		this.nutriValue = nutriValue;
	}
	
	
}
