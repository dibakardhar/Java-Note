
import java.util.Scanner;
class interstmatlena{
    public static void main(String []args){
        Scanner obj= new Scanner (System.in);
        int p,t;
        float r,i;
        System.out.print("Enter principal");
        p=obj.nextInt();
        System.out.print("Enter rate");
        r=obj.nextFloat();
        System.out.print("Enter Time");
        t=obj.nextInt();
        i=(float)p*r*t/100;
        System.out.println("intest"+i);
    }    
}

