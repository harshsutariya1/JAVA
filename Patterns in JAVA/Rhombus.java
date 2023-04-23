import java.util.*;
public class Rhombus {
     static Scanner sc = new Scanner(System.in);

     void rhombus(int height){
          for(int line = 1; line<=height; line++){
               for(int i = height-line; i>=1; i--){//print spaces.
                    System.out.print(" ");
               }
               for(int j = 1; j<=height; j++){//print characters.
                    System.out.print("* ");
               }
               System.out.println();
          }
     }

     void Hollow_rhombus(int height){
          for(int line = 1; line<=height; line++){
               for(int i = height-line; i>=1; i--){
                    System.out.print(" ");
               }
               for(int j = 1; j<=height; j++){
                    if(line==1||line==height||j==1||j==height){
                         System.out.print("* ");
                    }else{
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
     }

     public static void main(String args[]){
          Rhombus print = new Rhombus();
          int height;

          System.out.print("Enter Height of Rhombus: ");
          height = sc.nextInt();

          System.out.println("Rhombus:");
          print.rhombus(height);

          System.out.println("Hollow Rhombus:");
          print.Hollow_rhombus(height);
     }
}
