//Display  ex- 5 -1 2 3 4 5 using while loop
import java.util;

class program7
{
    public static void main(String arg[])
    {
        System.out.println("Enter value");
        Scanner sc=new Scanner(System.in);

        int value=sc.nextInt();

       perform p =new perform(value);

    }
}

class perform
{
    void Display(int no)
    {
        int icnt=0;
        while(icnt < no)
        {
            System.out.println(icnt);
            icnt++;
        }
    }
    
    
    

}