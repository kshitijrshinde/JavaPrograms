// Write a program to perform addition of 2 numbers
import java.util.Scanner;

class program4
{
    public static void main(String arg[])
    {
        perform obj=new perform();
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter no's :");
      int i=sc.nextInt();
      int j=sc.nextInt();
      int k=   obj.add(i,j);
   
      System.out.println(k);
    }
}

class perform
{
    int add(int i,int j)
    {
        return i+j;
    }
}