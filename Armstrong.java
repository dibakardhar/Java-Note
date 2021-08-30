import java.util.Scanner;
class Armstrong{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=obj.nextInt();
        int s=0,r;
        int u=a;
        while (a != 0) {    //!= this is not equals 2
        r = a % 10;
        s = s +r*r*r;
        a = a/10;
    }
    if(s==u){
         System.out.println("Armstrong no");

    }
    else {
        System.out.println("not Armstrong");
    }
    }
}