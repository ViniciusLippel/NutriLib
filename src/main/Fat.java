package main;

public class Fat {
	private double total;
	private double saturated;
	private double trans;
	
	public Fat(double total, double saturated, double trans) {
		this.total = total;
		this.saturated = saturated;
		this.trans = trans;
	}
	
	//Getters & Setters
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getSaturated() {
		return saturated;
	}
	public void setSaturated(double saturated) {
		this.saturated = saturated;
	}
	
	public double getTrans() {
		return trans;
	}
	public void setTrans(double trans) {
		this.trans = trans;
	}
	
	
	//Sum Fat
	public void sumFat(Fat fat) {
		this.total = this.total + fat.getTotal();
		this.saturated = this.saturated + fat.getSaturated();
		this.trans = this.trans + fat.getTrans();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fat [total=");
		builder.append(total);
		builder.append(", saturated=");
		builder.append(saturated);
		builder.append(", trans=");
		builder.append(trans);
		builder.append("]");
		return builder.toString();
	}
	
}
