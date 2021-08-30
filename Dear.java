import java.util.Scanner;
class Dear{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter something please bhaiya ");
        double a=obj.nextDouble();
        double b=Math.toRadians(a);
        System.out.println("Value is "+b);
        double c=Math.sin(b);
        System.out.println(" Bhaiya this is Sin Value is "+c);
        double d=Math.cos(b);
        System.out.println("Bhaiya this is cos Value is "+d);
        double e=Math.tan(b);
        System.out.println("Bhaiya this is tan Value is thank you bhaiya and didi "+e);
    }
}