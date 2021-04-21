import java.util.*;
class Ques3{
    public static void main(String args[])
    {
         Scanner obj=new Scanner(System.in);
         System.out.println("No. of classes held: ");
         int x=obj.nextInt();
         System.out.println("No. of classes attend: ");
         int y=obj.nextInt();
         float pf;
         pf=((y*100)/x);
         System.out.println("Percentage of class attended: "+pf);
         if(pf>=75)
              System.out.println("\n You are eligible");
         else 
              System.out.println("\n You are not eligible");
    }
}