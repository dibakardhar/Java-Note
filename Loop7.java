import java.util.Scanner;
public class Loop7{
    public static void main(String []args){ 
             
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter any Number: ");
          int n=sc.nextInt();
          for(int i=1;i<=(2*n+1);i++){
              for(int j=1;j<=(2*n);j++){
                  System.out.print("*_");
                  if(j>n && j<=2*n){
                     
                     for(int k=1;k<=n;k++){
                         System.out.print("_*_");
                        }
                     System.out.println();
            }
             
      }
      System.out.println();
    }
}
}

    
              
