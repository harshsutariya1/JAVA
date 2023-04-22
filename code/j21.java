//program to find sum of two dynamic arrays/matrix.
import java.util.*;

public class j21 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          //taking row and column input.
          System.out.print("Enter array1 and array2 row : ");
          int row = sc.nextInt();
          System.out.print("Enter array1 and array2 column : ");
          int column = sc.nextInt();

          //Creating Array.
          int array1[][] = new int [row][column];
          int array2[][] = new int [row][column];
          int array3[][] = new int [row][column];

          //taking input for array1.
          System.out.println("Enter values for array1 :");
          for(int i = 0; i<row; i++){ 
               for(int j = 0; j<column; j++){
                    System.out.printf("Enter value for [%d][%d] = ",i, j);
                    array1[i][j] = sc.nextInt();
               }
          }
          //taking input for array2.
          System.out.println("Enter values for array2 :");
          for(int i = 0; i<row; i++){ 
               for(int j = 0; j<column; j++){
                    System.out.printf("Enter value for [%d][%d] = ",i, j);
                    array2[i][j] = sc.nextInt();
               }
          }
          //array1 + array2 = array3 output.
          System.out.println("sum of two arrays : ");
          for(int i = 0; i<row; i++){ //array1 output.
               for(int j = 0; j<column; j++){
                    System.out.printf("%d ",array1[i][j]);
               }
               System.out.println();
          }

          System.out.println("   +    ");
          
          for(int i = 0; i<row; i++){ //array2 output.
               for(int j = 0; j<column; j++){
                    System.out.printf("%d ",array2[i][j]);
               }
               System.out.println();
          }

          System.out.println("   =    ");

          for(int i = 0; i<row; i++){ //array3 output.
               for(int j = 0; j<column; j++){
                    array3[i][j] = array1[i][j] + array2[i][j];
                    System.out.printf("%d ",array3[i][j]);
               }
               System.out.println();
          }

          sc.close();
     }
}
