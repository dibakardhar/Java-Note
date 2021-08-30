import java.util.Scanner;
class ddr{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=obj.nextInt();
        int b=a%2;
        switch(b%2){
            case 1:
            System.out.println("odd");
            break;
            
            default:
            System.out.println("even");
            break;
        }
    }
}