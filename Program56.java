import java.util.Scanner;

class Program56
{
    public int Addition(int iNo1,int  iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Program56 pobj = new Program56();

        iRet = pobj.Addition(iValue1, iValue2);

        System.out.println("The Addition is : "+iRet);
    }
}