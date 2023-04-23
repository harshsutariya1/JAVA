import java.util.*;
class Butterfly_pattern{
     static Scanner sc = new Scanner(System.in);

     static void butterfly(int height){
          for(int line = 1; line<=height; line++){
               for(int i = 1; i<=line; i++){ //print characters.
                    System.out.print("* ");
               }
               for(int j = height-line; j>0; j--){ //print spaces.
                    System.out.print("  ");
               }
               for(int j = height-line; j>0; j--){ //print spaces.
                    System.out.print("  ");
               }
               for(int z = 1; z<=line; z++){ //print characters.
                    System.out.print("* ");
               }
               System.out.println();
          }
          for(int line = height; line>=1; line--){
               for(int i = line; i>=1; i--){ //print characters.
                    System.out.print("* ");
               }
               for(int j = 0; j<height-line; j++){
                    System.out.print("  ");
               }
               for(int j =  0; j<height-line; j++){
                    System.out.print("  ");
               }
               for(int z = line; z>=1; z--){
                    System.out.print("* ");
               }
               System.out.println();
          }
     }

     public static void main(String args[]){
          System.out.print("Enter Height: ");
          butterfly(sc.nextInt());
     }
}