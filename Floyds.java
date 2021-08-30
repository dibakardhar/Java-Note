import java.util.Scanner;
public class Floyds
{
    public static void main(String []args){ 
         {    
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter any Number: ");
              int n= sc.nextInt();
              int num=1;
              for(int i=1;i<=n;i++){
                  for(int j=1;j<=i;j++){
                         System.out.print(num+" ");
                         num +=1;
                     
                    }
                  System.out.println();
                }
            }
        }
    }