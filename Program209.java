import java.util.Scanner;

class Program209
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCount = 0, iCnt = 0;

        System.out.println("Enter the String : ");
        String name =sobj.nextLine();

        char Arr[] = name.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt]) >= 'a' && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }

        System.out.println("Number of small Charecters are : "+iCount);
    }    
}