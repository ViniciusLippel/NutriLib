package main;

public class NutriValue {
	
	private int servingSize;
	private int calories;
	private double carbs;
	private Fat fat;
	private double protein;
	private MineralList mineralList;
	private VitaminList vitaminList;
	
	
	public NutriValue(int servingSize, int calories) {
		this.servingSize = servingSize;
		this.calories = calories;
	}
	
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
	public int getServingSize() {
		return servingSize;
	}
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
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
	
	
	//Add Mineral
	public void addMineral(Mineral mineral, double amount) {
		Amount<Mineral> newMineral = new Amount<Mineral>(mineral, amount);
		if(this.mineralList == null)
			this.mineralList = new MineralList();
		this.mineralList.add(newMineral);
	}
	
	
	//AddVitamin
	public void addVitamin(Vitamin vitamin, double amount) {
		Amount<Vitamin> newVitamin = new Amount<Vitamin>(vitamin, amount);
		if(this.vitaminList == null)
			this.vitaminList = new VitaminList();
		this.vitaminList.add(newVitamin);
	}
	
	
	//Sum NutriValue
	public void sumNutriValue(NutriValue nutriValue) {
		this.servingSize = this.servingSize + nutriValue.getServingSize();
		this.calories = this.calories + nutriValue.getCalories();
		this.carbs = this.carbs + nutriValue.getCarbs();
		this.fat.sumFat(nutriValue.getFat());
		this.protein = this.protein + nutriValue.getProtein();
		this.mineralList.sumMineralList(nutriValue.getMineralList());
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NutriValue [servingSize=");
		builder.append(servingSize);
		builder.append(", calories=");
		builder.append(calories);
		builder.append(", carbs=");
		builder.append(carbs);
		builder.append(", fat=");
		builder.append(fat);
		builder.append(", protein=");
		builder.append(protein);
		builder.append(", mineralList=");
		builder.append(mineralList);
		builder.append(", vitaminList=");
		builder.append(vitaminList);
		builder.append("]");
		return builder.toString();
	}
		
}
