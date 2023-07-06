package models;

import java.io.Serializable;

public class Health implements Serializable {

	//Field
	private double height;
	private double weight;
	private double bmi;
	private String taikei;
	
	//Constructor
	public Health() {}
	public Health(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	//GetterSetter
	public double getTall() {
		return height;
	}
	public void setTall(double dblHeight) {
		this.height = dblHeight;
	}
	public double getWeit() {
		return weight;
	}
	public void setWeit(double weit) {
		this.weight = weit;
	}
	public double getBmi() {
		setupBMI();
		return this.bmi;
	}
	public String getTaikei() {
		setupTaikei();
		return this.taikei;
	}
	
	//Method
	private void setupBMI() {
		this.bmi = this.weight / (this.height / 100.0 * this.height /100.0);
	}

	private void setupTaikei() {
		String result ="";
		if(this.bmi < 18.5) { result = "やせ型"; }
		else if(this.bmi < 25.0) { result = "普通"; }
		else if(this.bmi >= 25.0) { result = "肥満"; }

		this.taikei = result;
	}
}