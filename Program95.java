// Input 4  4   
/*
    1   *   3   *
    1   *   3   *
    1   *   3   *
    1   *   3   *
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((j % 2) == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
    }
}

class Program95
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number Of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}