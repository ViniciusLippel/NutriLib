package main;

public class Amount <T> {
	
	private T object;
	private double amount;
	
	public Amount (T object, double quantity) {
		this.object = object;
		this.amount = quantity;
	}
	
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	
	public double getQuantity() {
		return amount;
	}
	public void setQuantity(double quantity) {
		this.amount = quantity;
	}
	
	
}
