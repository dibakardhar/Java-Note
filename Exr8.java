import java.util.Scanner;
public class Exr8{
    public static void main(String []args){ 
             
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter any Number: ");
              int n= sc.nextInt();
              int j=0;
              int sum =0;
              System.out.print("The odd numbers are : \n");
              for(int i=1; ;i++){
                  if(i%2!=0){
                      System.out.print(i+"  ");
                      sum +=i;
                      j +=1;
                    }
                    if(j==n){
                        break;
                    }
                }
              System.out.print("\nThe Sum of Natural Number upto " + n+" terms :" +sum);
      }
    }
    
              
