// Name: Deepmala Bhomi                                Date Assigned: 11/14/2019
//
// Course: CSCI 2000 44306                             Date Due: 11/21/2029
//
// Instructor: Ms. Greer
//
// File name: Pet.java
//
/* Program Description: This is a class that represents a pet. This class 
                        includes 4 instance variables and setter and getter
                        methods for each instance variable.*/                        


public class Pet
{

   // data attributes- instance variables
   private String petName;
   private String petType;
   private String ownerName;
   private String ownerPhone;
   
   /*setters*/
   
   //sets instance variable petName
   public void setPetName(String name)
   {
      petName=name;
   }
   
   //sets instance variable petType
   public void setPetType(String type)
   {
      petType=type;
   }

   //sets instance variable ownerName
   public void setOwnerName(String owner)
   {
      ownerName=owner;
   }

   //sets instance variable ownerPhone
   public void setOwnerPhone(String number)
   {
      ownerPhone=number;
   }



   /*getters*/
   
   //gets value from instance variable petName
   public String getPetName()
   {
      return petName;
   }

   //gets value from instance variable petType
   public String getPetType()
   {
      return petType;
   
   }

   //gets value from instance variable ownerName
   public String getOwnerName()
   {
      return ownerName;

   }
   
   //gets value from instance variable ownerPhone
   public String getOwnerPhone()
   {
      return ownerPhone;
   }
}