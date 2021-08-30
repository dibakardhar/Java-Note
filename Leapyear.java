import java.util.Scanner;
class Leapyear{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year");
        int a=obj.nextInt();
        if(a%400==0){
            System.out.println("Leap year");
        }
        else if(a%100==0){
            System.out.println(" Not Leap year");
        }
        else if(a%4==0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap year");
        }
    }
}