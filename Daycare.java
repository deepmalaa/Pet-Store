// Name: Deepmala Bhomi                                Date Assigned: 11/14/2019
//
// Course: CSCI 2000 44306                             Date Due: 11/21/2029
//
// Instructor: Ms. Greer
//
// File name: DayCare.java
//
/* Program Description: This program asks user for their pet name, pet type, 
                        their name and phone number. Using methods of Pet 
                        class, this program assigns user input to Pet object's
                        instances. Then, finally displays the record stored 
                        using Pet methods. */

//import Scanner class

import java.util.Scanner;

//creating class
public class Daycare      //uses Pet class
{
   
   public static void main (String[] args)
   {
      
      //creating new pet object
      Pet petCare = new Pet();
   
   
      //displaying header
      System.out.println("=========================================");
      System.out.println("* Welcome to Wizard of Paws Pet Daycare *");
      System.out.println("=========================================");
      System.out.println("*    Dogs and cats are our specialty.   *");
      System.out.println("*                                       *");
      System.out.println("*    Register your information below.   *");
      System.out.println("=========================================\n\n");
      
      
      //display pet information header
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("        Pet Information        ");
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      
      
      //declare a Scanner object
      Scanner in = new Scanner(System.in);
      
      
      //using Scanner to get pet name and store it in variable
      System.out.print(" - Name: ");
      String name= in.nextLine();
      
      //using setter to set pet name 
      petCare.setPetName(name);

      
      //using Scanner to get pet name and store it in variable
      System.out.print(" - Type (DOG or CAT): ");
      String type = in.nextLine();
      
      //using setter to set pet name
      petCare.setPetType(type);
      
      
      System.out.println("\n");
      
      
      //display owner information header
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("       Owner Information       ");
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      
      
      //using Scanner to get name and store it in variable
      System.out.print(" - Name: ");
      String nameOwner= in.nextLine();
      
      //using setter to set owner name
      petCare.setOwnerName(nameOwner);
      
      
      //using Scanner to get phone num and store it in variable
      System.out.print(" - Phone number (###-####): ");
      String phoneNumber= in.nextLine();
      
      //using setter to set phone number
      petCare.setOwnerPhone(phoneNumber);
      
      
      //display pet record heading
      System.out.println("\n\n===============================");
      System.out.println("*         Pet Record          *");
      System.out.println("===============================");
      
      // displays formatted pet records
      System.out.printf("* " +"%-22s(%2s) *\n", petCare.getPetName(),petCare.getPetType()); 
      System.out.println("*                             *");
      System.out.printf("* " +"%-27s%2s \n", petCare.getOwnerName(),"*");
      
      System.out.printf("* " +"%-27s%2s \n", petCare.getOwnerPhone(),"*");
      
      System.out.println("===============================");
           
        
   }  //end main method
} //end class
