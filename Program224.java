import java.util.Scanner;

class Arrayx
{
    protected int Arr[];

    public Arrayx(int iSize)
    {
        System.out.println("Allocating the resources.. ");
        Arr = new int[iSize];        //Allocating resources
    }

    public void finalize()
    {
        System.out.println("Deallocating the resources...");
        Arr = null;
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
        sobj = null;
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            System.out.println(this.Arr[iCnt]);
        }
    }
}

class NNumberx extends Arrayx
{
    public NNumberx(int iSize)
    {
        super(iSize);
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

    //Other functions
}
class Program224
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of elements : ");
        int iSize = sobj.nextInt();

        NNumberx nobj = new NNumberx(iSize);

        nobj.Accept();

        nobj.Display();

        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Number of even elements are : "+iRet);

        sobj = null;

        nobj = null;

        System.gc();
    }
}