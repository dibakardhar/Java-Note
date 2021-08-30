import java.util.Scanner;
class Calc{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=obj.nextInt();
        System.out.println("Enter a number");
        int b=obj.nextInt();
        System.out.println("For addition press 1");
        System.out.println("For substraction press 2");
        System.out.println("For multiplication press 3");
        System.out.println("For division press 4");
        System.out.println("Enter your choice: ");
        int r=obj.nextInt();
        if(r==1){
            int c=a+b;

             System.out.println("your answer is ="+c);
        }
        else if(r==2){
            int e=a-b;
             System.out.println("your answer is ="+e);
        }
        else if(r==3){
            int f=a*b;
             System.out.println("your answer is ="+f);
        }
        else if(r==4){
            double g=(double)a/b;
             System.out.println("your answer is ="+g);
        }
        else{
            System.out.println("Your is wrong");
        }
            
    }
}