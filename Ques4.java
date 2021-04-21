import java.util.Scanner;
class Ques4{
    public static void main(String[] args) {
      Scanner obj= new Scanner(System.in);
      int year;
      System.out.println("Enter the year: ");
      year= obj.nextInt();
      boolean leap = false;
        if (year% 4 == 0) {
          if (year % 100 == 0) {
             if (year % 400 == 0)
                leap = true;
             else
                leap = false;
      }
        else
          leap = true;
      }
    
         else
           leap = false;
      if (leap)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
  }
}
