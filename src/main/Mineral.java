package main;

public class Mineral {
	
	private String name;
	private String info;
	
	public Mineral(String name) {
		this.name = name;
	}
	
	public Mineral info(String info) {
		this.info = info;
		return this;
	}
	
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
		builder.append("Mineral [name=");
		builder.append(name);
		builder.append(", info=");
		builder.append(info);
		builder.append("]");
		return builder.toString();
	}
}
