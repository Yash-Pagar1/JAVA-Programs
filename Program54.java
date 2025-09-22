import java.util.*;

class Program54
{
    public static void main(String A[])
    {
        Scanner sobj = null;

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("The Addition is : "+iAns);
    }
}