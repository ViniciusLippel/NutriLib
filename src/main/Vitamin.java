package main;

public class Vitamin {
	
	private String name;
	private String info;
	
	//Getters & Setters
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vitamin [name=");
		builder.append(name);
		builder.append(", info=");
		builder.append(info);
		builder.append("]");
		return builder.toString();
	}
	
	
}
