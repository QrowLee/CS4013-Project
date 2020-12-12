import java.util.ArrayList;
import java.time.LocalDate;
public class propertySystem
{
    // instance variables - replace the example below with your own
    private int x;
    ArrayList<property3> propertyList = new ArrayList<property3>();
    LocalDate myObj = LocalDate.now();
    propertyTax def = new propertyTax();
    propertyTax temp = new propertyTax();
    public propertySystem()
    {
    }
    public propertySystem(LocalDate a)
    {
        myObj = a;
    }
    public void setDate(LocalDate a){
    myObj = a;
    }
    public LocalDate getDate(){
    return myObj;
    }
    public void pay(String property, String name){
      ArrayList<Payment2> duePayments = property3.propertyTax(myObj,def);
      String[] parts = payment.split(" ");
      for (property3 p : propertyList){
        if ((p.getAddress()).equals(property)|| (p.getPostcode()).equals(property)){
        ArrayList<Payment2> DuePayments = getDuePayments(property);
        }
        }
      String ammountStr = parts[0];
      
      String property = parts[1];
      double ammount = Double.parseDouble(ammountStr);
      
    }
    public ArrayList<Payment2> getDuePayments(String property){
    for (property3 p : propertyList){
    if ((p.address.equals(property)) || (p.postcode.equals(property))){
    return p.propertyTax(myObj,def);
    }
    }
    }
    public void addProperty(String payment){
        String[] parts = payment.split(" ");
        String add = parts[0];
        String post = parts[1];
        String emv = parts[2];
        String loc = parts[3];
        String PR = parts[4];
        boolean pr = false;
        if (PR.contains("y")){pr = true;}
        String owner = parts[5];
        double estMarketVal = Double.parseDouble(emv);
        property3 prop = new property3(add, post, estMarketVal, loc, pr, owner);
        propertyList.add(prop);
    }
    public void propertyPayments(String property){
    for (property3 p : propertyList){
    if ((p.address.equals(property)) || (p.postcode.equals(property))){
    System.out.println(p.payments);
    }
    }
    }
    public void ownerPayments(String owner){
    for (property3 p : propertyList){
    if (p.owners.contains(owner)){
    System.out.println(p.payments);
    }
    }
    }
    public void areaPayStatistics(String code){
    for (property3 p : propertyList){
    if(code.equals((p.postcode).substring(0,3))){
                    System.out.println(p.payments);
                    System.out.println("got here");
    }
    }
    }
    public void testTaxChange(double tax, double rate,double locationTax,double notPrinciple,double penalty){
    temp = new propertyTax(tax,rate,locationTax,notPrinciple,penalty);
    }
    public void overDuePayments(){
    for (property3 p : propertyList){
    if (p.lastPayment.getYear() < myObj.getYear()){
    for (Payment2 q : p.duePayments){
    System.out.println(q.toString());
    }
    }
    }
    }
}
