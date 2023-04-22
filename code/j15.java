import java.util.*;

class j15 {

     public static int factorial(int num)
     {
         if (num >= 1)
            return num * factorial(num - 1);
         else 
            return 1;
     }
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter number : ");
  int n  = sc.nextInt();
  int fac = factorial(n);
    System.out.println("factorial of "+n+" is "+fac);
  sc.close();
  }
}