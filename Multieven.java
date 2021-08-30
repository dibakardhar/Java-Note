import java.util.Scanner;
class Multieven{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=obj.nextInt();
        int m=1;
        for(int i=2;i<=a;i=i+2){       //This is multiplication of a number 
            m=m*i;
        }
        System.out.println("the multiplication of even is  "+m );
    }
}