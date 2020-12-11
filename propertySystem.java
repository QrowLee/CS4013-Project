import java.util.ArrayList;
import java.time.LocalDate;
public class propertySystem
{
    // instance variables - replace the example below with your own
    private int x;
    ArrayList<property3> propertyList = new ArrayList<property3>();
    LocalDate myObj = LocalDate.now();
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
    public void pay(String payment, String name){
      String[] parts = payment.split(" ");
      String ammountStr = parts[0];
      String property = parts[1];
      double ammount = Double.parseDouble(ammountStr);
      for (property3 p : propertyList){
        if ((p.getAddress()).equals(property)|| (p.getPostcode()).equals(property)){
        p.pay(name, ammount);
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
}
