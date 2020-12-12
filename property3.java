 
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
    ArrayList<Payment2> payments;
    ArrayList<Payment2> duePayments;
    int missedYears;
    LocalDate lastPayment = LocalDate.now();
    ArrayList<String> owners = new ArrayList<String>();
    public void main(String[] args) {
        
    }
    public property3(String address, String postcode, double estMarketVal, String location, boolean privateResidence, String owner) {
        this.address = address;
        this.postcode = postcode;
        this.estMarketVal = estMarketVal;
        this.location = location;
        this.privateResidence = privateResidence;
        (this.owners).add(owner);
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
    public ArrayList<String> getOwners() {
        return owners;
    }
    public void setEstMarketVal(double estMarketVal) {
        this.estMarketVal = estMarketVal;
    }
    
    public double getEstMarketVal() {
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
    public ArrayList<Payment2> propertyTax(LocalDate x, propertyTax p) {
            for (int missedYears = lastPayment.getYear() - x.getYear();missedYears > -1; missedYears++){
            duePayments.add(p.getTax(missedYears,estMarketVal,location,privateResidence,x));
          }
          return duePayments;
    }
    public String pay(String owner, double ammount, LocalDate Date, propertyTax p) {
        if(payments.get(paymentNo++).ammount == ammount){
        duePayments.remove(payments.get((duePayments.size())-1));
        payments.add(new Payment2(owner,ammount,false,Date));
        paymentNo++;
        lastPayment = LocalDate.now();
        lastPayment = Date;
        return (payments.get((paymentNo)-1).toString() +" payed /n" + payments.get((paymentNo)-1));
 
        }

        return "no due Payments fits this description";
    }
    public String getPropertyTax() {
        String back = "";
        for (int i = 0; i < payments.size(); i++) {
            back = back + payments.get(i);
        }
        return back;
    }
}