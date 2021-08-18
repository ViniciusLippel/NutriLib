package main;

public class Amount <T> {
	
	private T object;
	private double amount;
	
	public Amount (T object, double amount) {
		this.object = object;
		this.amount = amount;
	}
	
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double quantity) {
		this.amount = quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Amount [object=");
		builder.append(object.toString());
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
	
	
}
