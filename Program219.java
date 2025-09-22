import java.util.Scanner;

class NNumberx
{
    public int Arr[];

    public NNumberx(int iSize)
    {
        Arr = new int[iSize];       // Resource allocation
    }

    public void Accept()
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            System.err.println(this.Arr[iCnt]);
        }
    }

    public int CountEven()
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            if((this.Arr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class Program219
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number of elements : ");
        int iSize = sobj.nextInt();

        NNumberx nobj = new NNumberx(iSize);

        nobj.Accept();

        nobj.Display();

        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Number of even elements are : "+iRet);

        sobj = null;
    }
}