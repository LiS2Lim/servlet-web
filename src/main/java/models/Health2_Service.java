package models;

public class Health2_Service {
	
	public Health2_Service(Health2 h) {
		this.setBmi(h);
		this.setBodyType(h);
	}
	
	private void setBmi(Health2 h) {
		double result = 0;
		//TODO bmi計算
		h.setBmi(result);
	}
	
	private void setBodyType(Health2 h) {
		String result = "";
		//TODO bodytype計算
		h.setBodyType(result);
	}
}