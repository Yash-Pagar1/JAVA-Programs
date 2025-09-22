import java.util.Scanner;

class Number
{
    public void DisplayNonFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program62
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayNonFactors(iValue);
    }
}