//print hello...
import java.util.Scanner;

class program5
{
    public static void main(String arg[])
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("How Many Times :");
     int n=sc.nextInt();

     for(int i=1; i <= n; i++)
     {
        System.out.println("Hello");
     }
    
    }
}