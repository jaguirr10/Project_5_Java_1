//Java Program       person.java
//Course             CSE 1301J -002
//Name:              Juan Aguirre      
//Assignment#:        Project 4 
//Due Date:           11/20/2014
//purpose: create a person class that obtains  the names and weights of all the people who get on the elevator

public class person
{
 private String names;
 public int  weights;

public person()
{ 
 names = "";
 weights  = 0;
 }
 

  public person(String n, int wts)
  {
    names = n;
   weights = wts;
   }
   public String toString()
    {
    return names + "\t" + weights;
   
    }
 
    public String getNames()
  {
    return names;
  }
  
  public int getWeights()
  {
    return weights;
  }


  
 
 }