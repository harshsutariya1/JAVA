import java.util.*;
public class Parallelogram {

     static void parallelogram(int height, int Width){
          for(int line=1; line<=height; line++){
               for(int i = height-line; i>=1; i--){
                    System.out.print("  ");
               }
               for(int j = 1; j<=Width; j++){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }

     static void Hollow_parallelogram(int height, int Width){
          for(int line=1; line<=height; line++){
               for(int i = height-line; i>=1; i--){
                    System.out.print("  ");
               }
               for(int j = 1; j<=Width; j++){
                    if(line==1||line==height||j==1||j==Width){
                         System.out.print("* ");
                    }else{
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
     }

     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Height: ");
          int height = sc.nextInt();
          System.out.print("Enter Width: ");
          int Width = sc.nextInt();
          System.out.println("Parallelogram:");
          parallelogram(height, Width);
          System.out.println("\nHollow Parallelogram:");
          Hollow_parallelogram(height, Width);
          sc.close();
     }
}
