package main;

public class Amount <T> {
	
	private T object;
	private double quantity;
	
	public Amount (T object, double quantity) {
		this.object = object;
		this.quantity = quantity;
	}
	
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
