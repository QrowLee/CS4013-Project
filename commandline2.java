 

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
/**
   A menu from the vending machine.
*/
public class commandline2
{    
   private Scanner in;
   ArrayList<Property> propertyList = new ArrayList<Property>();
   String input;
   String name;
   boolean loggedIn;
   public commandline2(int ownerNumber)
   {
      in = new Scanner(System.in);
   }

   public void run(propertySystem machine)
         throws IOException
   {
      boolean more = true;
      while (more)
      { 
         System.out.println("command list: \n my payments \n property payments \n owner payments \n log in \n");
         System.out.println("type help to show explanation of commands");
         String command = in.nextLine();
         switch (input) {
           case "make payment":
           if(!loggedIn){System.out.println("please log in to make payment");
            break;
            }
           System.out.println("enter address or postcode and ammount");
           String payment = in.nextLine();
           machine.pay(payment,name);
           break;
           case "add property":
           System.out.println("Enter Address, Postcode, Estimated Market Value, Location, Private Residence(yes/no) and owner(s)");
           String payment = in.nextLine();
           machine.addProperty(); 
           break;
           case "my payments":
           for(Property p : propertyList){
                if(p.owners.toString().equals(name)){
                    System.out.println(p.payments.toString());
                }else {
                    System.out.println("could not find address");
                }
            }  
           break;
           case "property payments":
           System.out.println("enter address or postcode");
           String property = in.nextLine();
           System.out.println(property);
           /*
           for (int i = 0; i < propertyList.size(); i++) {
               Property check = propertyList.get(i);
                System.out.println(check);
            */
            //for(Property p : machine){
                if((machine.address.equals(property)) || (machine.postcode.equals(property))){
                    System.out.println(machine.payments);
                    System.out.println("got here");
                }
            //}
           //}
           break;
           case "owner payments":
           System.out.println("enter address or postcode");
           String owners = in.nextLine();  
            for(Property p : propertyList){
                if(p.owners.toString().equals(owners)){
                    System.out.println(p.payments.toString());
                }else {
                    System.out.println("could not find address");
                }
            }
            
           break;
           case "overdue payments":
           break;
           case "Area Pay Statistics":
           System.out.println("code");
           String areaCode = in.nextLine();
           System.out.println(areaCode);
           /*
           for (int i = 0; i < propertyList.size(); i++) {
               Property check = propertyList.get(i);
                System.out.println(check);
            */
            for(Property p : propertyList){
                if(machine.postcode.equals(property.substring(0,3))){
                    System.out.println(machine.payments);
                    System.out.println("got here");
                }
            }
           //}
           break;
           case "Test Tax Change":
           break;
           case "help":
           System.out.println("figure it out");
           break;
           case "log in":
           System.out.println("enter name");
           name = in.nextLine();
           break;
           case "Set Date":
           break;
            }
      }
   }

   private Object getChoice(Object[] choices)
   {
      while (true)
      {
         String c = "help";
         System.out.println("command list: \n my payments \n property payments \n owner payments \n log in \n");
         input = in.nextLine();
      }      
   }
}
