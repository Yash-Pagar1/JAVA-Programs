import java.util.*;

class Program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String Name = sobj.nextLine();

        System.out.println("Enter Your Age : ");
        int Age = sobj.nextInt();

        System.out.println("Enter Your Marks : ");
        float Marks = sobj.nextFloat();

        System.out.println("Name is : "+Name);
        System.out.println("Age is: "+Age);
        System.out.println("Marks are : "+Marks);
    }
}