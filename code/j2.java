
//leap year...
import java.util.*;

public class j2 {
     public static void main(String[] s) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter year : ");
          int year = sc.nextInt();

          if (year % 4 == 0) {
               if (year % 100 == 0) {
                    if (year % 400 == 0) {
                         System.out.println("leap year.");
                    } else {
                         System.out.print("not a leap year.");
                    }
               } else {
                    System.out.println("leap year.");
               }
          } else {
               System.out.println("not a leap year.");
          }
          sc.close();
     }
}