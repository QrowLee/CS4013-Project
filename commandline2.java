 

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;
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
           System.out.println("enter address or postcode");
           String property = in.nextLine();
           System.out.println("enter number of payments you want to make");
           machine.pay(payment,name);
           break;
           case "add property":
           System.out.println("Enter Address, Postcode, Estimated Market Value, Location, Private Residence(yes/no) and owner(s)");
           String property = in.nextLine();
           machine.addProperty(property);
           break;
           case "my payments":
           if (loggedIn){
           machine.ownerPayments(name);
           }
           else{System.out.println("please log in to view payments");}
           break;
           case "property payments":
           System.out.println("enter address or postcode");
           String Property = in.nextLine();
           System.out.println(Property);
           machine.propertyPayments(Property);
           break;
           case "owner payments":
           System.out.println("enter address or postcode");
           String owners = in.nextLine();  
           machine.ownerPayments(owners);
           break;
           case "overdue payments":
           break;
           case "Area Pay Statistics":
           System.out.println("areaCode");
           String areaCode = in.nextLine();
           System.out.println(areaCode);
           machine.areaPayStatistics(areaCode);
           break;
           case "Test Tax Change":
           System.out.println("Do you wish to test a propert tax change yes/no");
           String answer = in.nextLine();
           if (answer.equals("yes")){
            
            
            
           }
           else{System.out.println("cancelling test tax change");
            break;}
           System.out.println("please enter new values for property tax System as they appear. if you do not wish to change the value leave it blank");
           break;
           case "help":
           System.out.println("figure it out");
           break;
           case "log in":
           System.out.println("enter name");
           name = in.nextLine();
           break;
           case "Set Date":
           LocalDate date = LocalDate.parse(in.nextLine());
           machine.setDate(date);
           break;
           case "get Date":
           System.out.println(machine.getDate());
           break;
           case "increase Year":
           machine.setDate(machine.getDate().plusYears(1));
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
