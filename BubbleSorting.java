import java.util.Scanner;
public class BubbleSorting{
    public static void main(String []args){ 
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any Number: ");
          int n = sc.nextInt();
          int a[] =new int[n];
          System.out.println("Enter array elements: ");
          for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
            }
            System.out.println("The elements before sorting are: ");
          for(int i=0;i<a.length;i++){
              System.out.print(a[i] + " ");
           }
          for(int i=0;i<=n-1;i++){
              for(int j=0;j<=n-1-i;j++){
                  if(a[j+1]<a[j]){
                      int temp = a[j+1];
                      a[j+1]=a[j];
                      a[j]=temp;
                    }
            }
          }
            System.out.println();
            System.out.println("The elements after sorting are: ");
            for(int i=0;i<a.length;i++){
              System.out.print(a[i] + " ");
           }
}
}
              
