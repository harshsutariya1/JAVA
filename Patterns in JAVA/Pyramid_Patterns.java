// Phyramid patterns.
import java.util.*;

public class Pyramid_Patterns {
     static Scanner sc = new Scanner(System.in);

     static void Pyramid(int height) {
          for(int line=1; line<=height; line++){ // prints lines.
               for(int z = 1; z<=height-line; z++){ // prints spaces.
                    System.out.print(" ");
               }
               for(int j = 1; j<=line; j++){ // prints stars.
                    System.out.print("* ");
               }
               System.out.println();
          }
     }

     static void Pyramid_with_Numbers(int height) {
          for(int line=1; line<=height; line++){ // prints lines.
               for(int z = 1; z<=height-line; z++){ // prints spaces.
                    System.out.print(" ");
               }
               for(int j = 1; j<=line; j++){ // prints stars.
                    System.out.print(j+" ");
               }
               System.out.println();
          }
     }

     static void Inverted_Half_Pyramid(int height) {
          for (int i = height; i > 0; i--) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
               }
               System.out.println();
          }
     }

     static void Half_Pyramid(int height) {
          for (int i = 1; i <= height; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
               }
               System.out.println();
          }
     }

     static void Rotated_Half_Pyramid(int height) {
          for(int line = 1; line <= height; line++){ // prints lines.
               for(int j = 1; j<=height-line; j++){
                    System.out.print("  ");
               }
               for(int z = 1; z <= line; z++){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }

     static void Inverted_Rotated_Half_Pyramid(int height) {
          for(int line = height; line >= 1; line--){
               for(int i = 1; i<=height-line; i++){ // prints spaces.
                    System.out.print("  ");
               }
               for(int j = 1; j<= line; j++){ // prints stars.
                    System.out.print("* ");
               }
               System.out.println();
          }
     }

     static void Floyds_Half_Triangle_Pattern(int height) {
          int num = 1;
          for (int i = 1; i <= height; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
               }
               System.out.println();
          }
     }

     static void Floyds_Triangle(int height){
          int num = 1;
          for(int line = 1; line<=height; line++){
               for(int i=1; i<=height-line; i++){
                    System.out.print(" ");
               }
               for(int j=1; j<=line; j++){
                    System.out.print((num++)+" ");
                    
               }
               System.out.println();
          }
     }

     static void _0_1_Triangle_Pattern(int height){
          int num = 1;
          for(int line = 1; line<=height; line++){
               for(int i=1; i<=height-line; i++){
                    System.out.print("  ");
               }
               for(int j=1; j<=line; j++){
                    System.out.print((num)+" ");
                    if(num==1){
                         num=0;
                    }else{num=1;}
               }
               System.out.println();
          }
     }

     public static void main(String[] args) {
          System.out.print("Enter Height of a phyramid: ");
          int height = sc.nextInt();
          System.out.println("1. Phyramid:");
          Pyramid(height);
          System.out.println("2. Phyramid with Numbers:");
          Pyramid_with_Numbers(height);
          System.out.println("3. Half Phyramid:");
          Half_Pyramid(height);
          System.out.println("4. Inverted Half Phyramid:");
          Inverted_Half_Pyramid(height);
          System.out.println("5. Rotated Half Phyramid:");
          Rotated_Half_Pyramid(height);
          System.out.println("6. Inverted Rotated Half Phyramid:");
          Inverted_Rotated_Half_Pyramid(height);
          System.out.println("7. Floyd's Half Triangle Pattern:");
          Floyds_Half_Triangle_Pattern(height);
          System.out.println("8. 0-1 Triangle Pattern:");
          _0_1_Triangle_Pattern(height);
          System.out.println("9. Floyd's Triangle Pattern:");
          Floyds_Triangle(height);
     }
}