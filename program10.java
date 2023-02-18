//Check number is even or not.

import java.util.Scanner;

class program10
{
    public static void main(String arg[])
    {
        System.out.println("Enter Number : ");   
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();

     perform obj=new perform();
    int no=obj.even(number);
    if(no==1)
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
  int even(int number)
  {
      if((number % 2)==0)
      {
        return 1;
      }
      else
      {
        return 0;
      }
  }
}