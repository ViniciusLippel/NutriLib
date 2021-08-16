package main;

public class NutriValue {
	
	private double carbs;
	private Fat fat;
	private double protein;
	private MineralList mineralList;
	private VitaminList vitaminList;
	
	
	//Fluent Interface Design Pattern
	public NutriValue carbs(double carbs) {
		this.carbs = carbs;
		return this;
	}
	
	public NutriValue fat(Fat fat) {
		this.fat = fat;
		return this;
	}
	
	public NutriValue protein(double protein) {
		this.protein = protein;
		return this;
	}
	
	public NutriValue mineralList(MineralList mineralList) {
		this.mineralList = mineralList;
		return this;
	}
	
	public NutriValue vitaminList(VitaminList vitaminList) {
		this.vitaminList = vitaminList;
		return this;
	}

	
	//Getters & Setters
	public double getCarbs() {
		return carbs;
	}
	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public Fat getFat() {
		return fat;
	}
	public void setFat(Fat fat) {
		this.fat = fat;
	}

	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}

	public MineralList getMineralList() {
		return mineralList;
	}
	public void setMineralList(MineralList mineralList) {
		this.mineralList = mineralList;
	}

	public VitaminList getVitaminList() {
		return vitaminList;
	}
	public void setVitaminList(VitaminList vitaminList) {
		this.vitaminList = vitaminList;
	}
		
	
}
