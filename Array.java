import java.util.Scanner;
public class Array{
    public static void main(String []args){ 
             
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any Number: ");
          int n = sc.nextInt();
          int a[] =new int[n];
          System.out.println("Enter array elements: ");
          for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
            }
            System.out.println("The elements are: ");
          for(int i=0;i<a.length;i++){
              System.out.print(a[i] + " ");
      }
    }
}
              
