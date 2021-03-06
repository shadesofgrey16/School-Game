package item;

import java.util.ArrayList;

abstract public class Item {

	private String name;
	private int effect, useType;
	private ArrayList<Integer> effectArray = new ArrayList<Integer>();
	public int getEffect() {
		return effect;
	}
	public void setEffect(int effect) {
		this.effect = effect;
	}
	public int getUseType() {
		return useType;
	}
	public void setUseType(int useType) {
		this.useType = useType;
	}
	public ArrayList<Integer> getEffectArray() {
		return effectArray;
	}
	public void setEffectArray(ArrayList<Integer> effectArray) {
		this.effectArray = effectArray;
	}
	
	@Override
	public String toString()
	{
		return name + "  " + 
				effect + "  " + 
				useType + "  " + 
				effectArray.toString();
	}
	
}
