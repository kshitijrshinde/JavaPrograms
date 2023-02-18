//Display  ex- 5 -1 + 2+  3 + 4 + 5 = 15 using while loop

import java.util.Scanner;

class program8
{
    public static void main(String arg[])
    {
        System.out.println("Enter value");
        Scanner sc=new Scanner(System.in);

        int value=sc.nextInt();

       perform obj =new perform();
       int result = obj.Display(value);
       System.out.println("Result is :"+result);

    }
}

class perform
{
    int Display(int no)
    {
         int isum=0;
     if(no < 0)
       {
        no=-no;
       }
       
        int icnt=1;
        while(icnt <= no)
        {
            isum = isum + icnt;
           icnt++;
        }
        return isum;
    }
    
    
    

}