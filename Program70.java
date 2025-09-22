    import java.util.Scanner;

    class Digits
    {
        public void Evendigits(int iNo)
        {
            int iDigit = 0;

            if(iNo < 0)
            {
                iNo = - iNo;
            }

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                if((iDigit % 2) == 0)
                {
                    System.out.println("The Even digits are : "+iDigit);
                }
                iNo = iNo / 10;
            }
        }
    }
    class Program70
    {
        public static void main(String A[])
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter Number : ");
            int iValue = sobj.nextInt();

            Digits dobj = new Digits();

            dobj.Evendigits(iValue);

            
        }
    }