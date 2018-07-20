//Java Program       Project5.java
//Course             CSE 1301J -002
//Name:              Juan Aguirre      
//Assignment#:        Project 5 
//Due Date:           11/20/2014
//purpose: create a Driver class that test The methods of how many people can get on the elevator, that sort of the people that got on the 
//the elevator by names and weights.  


import java.io.*;
import java.util.Scanner;

public class Driver
{
   public static void main(String[] args)
   {
       
      Elevator myelevator = new Elevator();
      
      myelevator.printArray(11);
      int a = myelevator.howMany();
      System.out.println("total people that got on " + a);
      myelevator.printArray(a);
      System.out.println();
     
      myelevator.bubble(11);    
      myelevator.printArray(11);
      int b = myelevator.howMany();
      System.out.println("total people that got on " + b);
      myelevator.printArray(b);
      System.out.println();
      
      myelevator.Sort2(11);    
      myelevator.printArray(11);
      int c = myelevator.howMany();
      System.out.println("total people that got on " + c);
      myelevator.printArray(c);
      System.out.println();
   
      
      
      System.out.println("Best method is:" + compareIt(a,b,c));
      
      System.out.println(" Coded by Juan Aguirre ");
   }
   public static String compareIt(int a,int b,int c)
   {
      if( a> b&&  a >  c)
         return " Method 1 - in order of arrival";
      else if( b> a && b>c)
         return " Method 2 - sort on weights" ;
      else 
         return  " Method 3 - sort on sort on names";
     
   }
   
      
     
   
}
      
      
  
 
