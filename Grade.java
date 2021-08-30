import java.util.Scanner;
class Grade{
    public static void mian(String []args){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter your percentage of grade scored");
       int a=obj.nextInt();
       if(a>=90&&a<=100){
           System.out.println("Grade A");
        }
        else if(a>=75&&a<=89){
            System.out.println("Grade B");
        }
        else if(a>=51&&a<=74){
            System.out.println("Grade C");
        }
        else if(a>=35&&a<=50){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}