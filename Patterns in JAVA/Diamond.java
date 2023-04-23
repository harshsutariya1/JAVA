import java.util.*;

class Diamond {
     static Scanner sc = new Scanner(System.in);

     static void diamond(int height) {
          // int totalHeight = (height*2)-1;
          for(int line = 1; line<=height; line++){
               for(int i = 1; i<=height-line; i++){//prints spaces.
                    System.out.print("  ");
               }
               for(int j = 1; j<=line; j++){//prints stars.
                    System.out.print("*   ");
               }
               System.out.println();
          }
          int restHeight = height-1;
          for(int line = restHeight; line>=1; line--){
               for(int i = 1; i<=height-line; i++){//prints spaces.
                    System.out.print("  ");
               }
               for(int j = 1; j<=line; j++){//prints stars.
                    System.out.print("*   ");
               }
               System.out.println();
          }

     }

     public static void main(String args[]) {
          System.out.print("Enter Diamond height:");
          diamond(sc.nextInt());
     }
}