/*
 Accept number from user and display its factors addition.

 Input :      10
 Output :    8

 Input :      9
 Output :     4
*/



import java.util.Scanner;

class program13
{
    public static void main(String arg[])
    {
        System.out.println("Enter Number");
       Scanner sc = new Scanner(System.in);
        int iNumber = sc.nextInt();
        perform obj =new perform();
        int iSum=obj.SumFactors(iNumber);
        System.out.println("Summation is : "+iSum );


    }
}

class perform
{
    int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
    
        for(iCnt = 1; iCnt < iNo; iCnt++)         // Time Complexity : O(N)
        {
            if((iNo % iCnt) == 0)
            {
                  iSum =  iSum + iCnt;
            }
        }
        return iSum;
    }
}