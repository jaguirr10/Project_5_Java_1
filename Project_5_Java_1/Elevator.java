//Java Program       Elevator.java
//Course             CSE 1301J -002
//Name:              Juan Aguirre      
//Assignment#:        Project 4 
//Due Date:           11/20/2014
//purpose: create an Elevator class that contains an array of all the people that can get on the elevator.In addition  create
//methods of how many people can get on the elevator,sorting the people who got on the elevator by name and weight. 

public class Elevator
{
  private person [] elev = new person [11];
  private int capacity; 
  
  public Elevator()
  {
   capacity = 11;
   
   elev [0] = new person("Anne", 30);
   elev [1] = new person("Bob", 150);
   elev [2] = new person("Ralph", 305);
   elev [3] = new person("Tim", 225);
   elev [4] = new person("Barbara", 135);
   elev [5] = new person("Jane", 160);
   elev [6] = new person("Steve", 80);
   elev [7] = new person("Tom", 200);
   elev [8] = new person("Mike", 165);
   elev [9] = new person("Shirley", 90);
   elev [10] = new person("Pam", 100);
   elev [11] = new person("Frank", 120);
  }
  
  int howMany()
  {
   int total = 0, i = 0;
   while(total <= 1100)
   {
   
   total += elev[i].weights;
   i++;
   }
   
   i--;
   total -= elev[i].weights;
   System.out.println("\n Total Weight " + total);
   
    return i;
}

 public void printArray(int size)
 {
  
 for(int i=0; i<size; i++)
 {
 
 System.out.println(elev[i]);
 }
 }
public  void bubble (int size)
   {
      boolean sorted;
      int numpairs =	size-1;
      do
      {
         sorted =	true;
         for(int i = 0;i<numpairs;++i)
             if (elev[i].weights>elev[i+1].weights)
             {
            person temp = elev[i];
             elev[i] = elev[i+1];
             elev[i+1] = temp;
             sorted = false;
             } 
         numpairs--;
      }
      while(sorted	==	false);
  }
   public void Sort2 ( int size)
   {
    int i,j;
    person temp;
     for( i = 0; i < size-1;i++)
        for(j = i+1;j<size;j++)
           if(elev[i].getNames().compareTo(elev[j].getNames())>0)
            {
             temp = elev[i];
             elev[i] = elev[j];
             elev[j] = temp;
            }
    }
   

 
 }
