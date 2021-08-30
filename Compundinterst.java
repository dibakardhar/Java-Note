import java.util.Scanner;
class Compundinterst{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the principal");
        float a=obj.nextFloat();
         System.out.println("Enter the rate");
        float b=obj.nextFloat();
         System.out.println("Enter the time");
        float c=obj.nextFloat();
        float A=(1+b/100);
        double V=a*Math.pow(A,c);
        System.out.println("Total amount is ="+V);
        double S=V-a;
        System.out.println("the Compund interst is ="+S);
    }
}