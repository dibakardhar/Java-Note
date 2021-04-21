import java.util.Scanner;
class Ques1{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter your Salary = ");
        a = obj.nextInt();
        System.out.println("Enter your year of Service = ");
        b = obj.nextInt();
        if(b>=5)
               {
                 c=(a*5)/100;
                 a=a+c;
               }
        System.out.println("Your Salary = " + a);
    }
}
