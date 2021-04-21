import java.util.Scanner;
class Ques2{
  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter your marks = ");
    int x = obj.nextInt();
    if(x<25){
      System.out.println("Your Grade = F");
    }
    else if((x>=25)&&(x<45)){
      System.out.println("Your Grade = E");
    }
    else if((x>=45)&&(x<50)){
      System.out.println("Your Grade = D");
    }
    else if((x>=50)&&(x<60)){
      System.out.println("Your Grade = C");
    }
    else if((x>=60)&&(x<80)){
      System.out.println("Your Grade = B");
    }
    else if((x>=80)&&(x<=100)){
      System.out.println("Your Grade = A");
    }
    else{
      System.out.println("Not correct marks");
    }
  }
}