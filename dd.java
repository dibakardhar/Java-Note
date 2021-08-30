import java.util.Scanner;
class dd{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=obj.nextInt();
        switch(a%2){
            case 1:
            System.out.println("odd");
            break;
            
            default:
            System.out.println("even");
            break;
        }
    }
}