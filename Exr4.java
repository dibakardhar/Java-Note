import java.util.Scanner;
public class Exr4{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
int sum=0;
System.out.println("Enter 10 numbers : ");
for(int i=1;i<=10;i++){
System.out.print("Number -"+i+" :");
int n= sc.nextInt();
sum += n;
}
System.out.println("The sum of 10 no is : " +sum);
System.out.println("The average is : " + (float)sum/10);
}
}