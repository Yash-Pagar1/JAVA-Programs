import java.util.Scanner;

import MarvellousLB.MarvellousString;

class Program213
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        int iRet = 0;

        iRet = mobj.CountSmall();

        System.out.println("Number of small Charecters are : "+iRet);
    }
}