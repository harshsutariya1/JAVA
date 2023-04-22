//program to print String inside the hollow rectangle.
import java.util.Scanner;

public class j28 {

     static void print_inside_rectangle(String text) {
          int len = text.length(); String str = text;
          int row = 5, column = len + 4;

          //Outter loop
          for (int i = 1; i <= row; i++) {
               //Inner loop
               for (int j = 1; j <= column; j++) {
                    // Border conditions
                    if (i == 1 || j == 1 || i == row || j == column) {
                         System.out.print("*");
                    } else {
                         //Padding conditions
                         if(j==2||j==column-1||i==2||i==row-1){
                              System.out.print(" ");
                         }else{
                              //String printing
                              System.out.print(str.charAt(j-3));
                         }
                    }
               }
               System.out.println();
          }
     }

     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Program to print any string inside hollow rectangle.");
          System.out.print("Enter any String: ");
          print_inside_rectangle(sc.nextLine());
          sc.close();
     }
}