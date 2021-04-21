import java.util.Scanner;
class Ques5{
   public static void main (String[] args)
   {
	   Scanner obj = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   int l = obj.nextInt();
	   System.out.println("Enter the width of Rectangle:");
	   int w = obj.nextInt();
	   if (l==w)
	      System.out.println("It is a Square");
	   else
	      System.out.println("It is not a Square");
   }
}