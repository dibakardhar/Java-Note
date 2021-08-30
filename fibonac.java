
import java.util.Scanner;
class fibonac{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=obj.nextInt();
        int b=0;
        int c=1;
        for(int i=0;i<=a;i++)
    {
    System.out.println(b);
    int d=b+c;
    b=c;
    c=d;

    }
    }
}