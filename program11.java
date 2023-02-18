// Accept number from user and display its factors


import java.util.Scanner;

class program11
{
    public static void main(String arg[])
    {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
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
            if((number % i)==0)
            {
                System.out.println(i);
            }
        }
    }
    
}