import java.util.Scanner;
class factorial{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=obj.nextInt();
        int m=1;
        for(int i=1;i<=a;i=i+1){       //This is factorial of natural no
            m=m*i;
        }
        System.out.println("factorial of "+a+" is "+m);
    }
}