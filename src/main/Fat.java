package main;

public class Fat {
	private double total;
	private double saturated;
	private double trans;
	
	public Fat() {
		
	}
	
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
	public void sum(Fat fat) {
		this.total = this.total + fat.getTotal();
		this.saturated = this.saturated + fat.getSaturated();
		this.trans = this.trans + fat.getTrans();
	}
	
	public Fat proportional(double servingSize) {
		Fat prop = new Fat();
		prop.setTotal(this.total / servingSize);
		prop.setSaturated(this.saturated / servingSize);
		prop.setTrans(this.trans / servingSize);
		return prop;
	}
	
	public void multiply(double n) {
		this.setTotal(this.total * n);
		this.setSaturated(this.saturated * n);
		this.setTrans(this.trans * n);
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
