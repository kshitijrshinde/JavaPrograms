//Check number is even or not.

import java.util.Scanner;

class program9
{
    public static void main(String arg[])
    {
        System.out.println("Enter Number : ");   
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();

     perform obj=new perform();
    boolean no=obj.even(number);
    if(no==true)
    {
        System.out.println("Number is Even...");
    }
    else
    {
        System.out.println("Number is Odd...");
    }
    

    }
}

class perform
{
  boolean even(int number)
  {
      if((number % 2)==0)
      {
        return true;
      }
      else
      {
        return false;
      }
  }
}