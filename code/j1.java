import java.util.*;

class j1 {
     public static void main(String[] s) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter any number: ");
          int num = sc.nextInt();

          if (num < 0) {
               System.out.println("number is negative.");
          } else {
               System.out.print("number is positive.");
          }
          sc.close();
     }
}