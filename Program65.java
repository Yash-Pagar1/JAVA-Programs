import java.util.Scanner;

class Number
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0, iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

class Program65
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.CountDigits(iValue);

        System.out.println("The Count of the Digits are : "+iRet);
    }
}