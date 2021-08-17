package lists;

import java.util.ArrayList;

import main.Amount;
import main.Vitamin;

/**
 * 
 * @author Vinicius Lippel
 *
 */
public class VitaminList {
	
	private ArrayList<Amount<Vitamin>> vitaminList;
	
	public VitaminList() {
		this.vitaminList = new ArrayList<Amount<Vitamin>>();
	}
	
	public VitaminList(ArrayList<Amount<Vitamin>> vitaminList) {
		this.vitaminList = vitaminList;
	}
	
	
	//Getters & Setters
	public ArrayList<Amount<Vitamin>> getVitaminList() {
		return vitaminList;
	}

	public void setVitaminList(ArrayList<Amount<Vitamin>> vitaminList) {
		this.vitaminList = vitaminList;
	}
	
	
	//Add
	public void add(Amount<Vitamin> vitamin) {
		Amount<Vitamin> inList = searchByName(vitamin.getObject().getName());
		if(inList == null)
			this.vitaminList.add(vitamin);
		else {
			int i = this.vitaminList.indexOf(inList);
			double sum = this.vitaminList.get(i).getAmount() + vitamin.getAmount();
			this.vitaminList.get(i).setAmount(sum);
		}
	}
		
		
	//Search by name
	public Amount<Vitamin> searchByName(String name){
		for(int i=0; i<this.vitaminList.size(); i++) {
			if(this.vitaminList.get(i).getObject().getName() == name)
				return this.vitaminList.get(i);
		}
		return null;
	}
	
	//Sum VitaminList
	public void sum(VitaminList vitaminList) {
		for(int i=0; i<vitaminList.getVitaminList().size(); i++) {
			this.vitaminList.add(vitaminList.getVitaminList().get(i));
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VitaminList [vitaminList=");
		builder.append(vitaminList);
		builder.append("]");
		return builder.toString();
	}
	
}
