// Accept number from user and display its non-factors


import java.util.Scanner;

class program12
{
    public static void main(String arg[])
    {
        System.out.println("Enter Number");
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number +" factors are : ");
        perform obj =new perform();
        obj.factors(number);

    }
}

class perform
{
   void factors(int number)
    {
        for(int i=1;i < number;i++)
        {
            if((number % i)!=0)
            {
                System.out.println(i);
            }
        }
    }
    
}