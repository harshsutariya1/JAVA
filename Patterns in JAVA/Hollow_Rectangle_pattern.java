//Hollow rectangle pattern program.
import java.util.Scanner;

public class Hollow_Rectangle_pattern {

     static void hollow_rectangle(int total_row,int total_column){
          //outer loop (for rows)
          for(int i = 1; i<=total_row; i++){
               //inner loop (for columns)
               for(int j = 1; j<=total_column; j++){
                    if(i==1||i==total_row||j==1||j==total_column){
                         System.out.print("* ");
                    }else{
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Program to print hollow rectangle.");
          System.out.print("Enter height (row):");
          int row = sc.nextInt();
          System.out.print("Enter width (column):");
          int column = sc.nextInt();
          hollow_rectangle(row, column);
          sc.close();
     }
}
