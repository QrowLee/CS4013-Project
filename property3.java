 
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
public class property3 {
	String address;
	String postcode;
	double estMarketVal;
	String location;
	boolean privateResidence;
	final double fixedTax = 100;
	int paymentNo = 0;
	ArrayList<Payment> payments;
	int missedYears;
	LocalDate lastPayment = LocalDate.now();
	public void main(String[] args) {
		
	}
	public property3(String address, String postcode, double estMarketVal, String location, boolean privateResidence, int... owners) {
		this.address = address;
		this.postcode = postcode;
		this.estMarketVal = estMarketVal;
		this.location = location;
		this.privateResidence = privateResidence;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public void setEstMarketVal(double estMarketVal) {
		this.estMarketVal = estMarketVal;
	}
	
	public double getEstMarketVal(double estMarketVal) {
		return estMarketVal;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setPrivateResidence(boolean privateResidence) {
		this.privateResidence = privateResidence;
	}
	
	public boolean getPrivateResidence() {
		return privateResidence;
	}
	public double propertyTax(LocalDate x) {
		double tax = 0;
		double rate = 0.04;
		double locationTax = 25;
		double notPrinciple = 0;
		double penalty = .07;
		int missedyears = x.getYear() - lastPayment.getYear();
		if(estMarketVal < 150000) {
			rate = 0;
		}else if(estMarketVal >= 150000 && estMarketVal < 400000) {
			rate = 0.01;
		}else if(estMarketVal >= 400000 && estMarketVal < 650000) {
			rate = 0.02;
		}
		if(location.equals("City")) {
			locationTax = 100;
		}else if(location.equals("Large town")) {
			locationTax = 80;
		}else if(location.equals("Small town")) {
			locationTax = 60;
		}else if(location.equals("Village")){
			locationTax = 50;
		}
		if(!privateResidence) {
			notPrinciple = 100;
		}
		return tax*(penalty*missedYears);
	}
	public void pay(String owner, double ammount) {
		payments.add(new Payment(ammount));
		paymentNo++;
		lastPayment = LocalDate.now();
	}
	public String getPropertyTax() {
		String back = "";
		for (int i = 0; i < payments.size(); i++) {
			back = back + payments.get(i);
		}
		return back;
	}
}