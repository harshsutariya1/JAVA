
//program to convert binary to decimal.
import java.util.Scanner;

public class j26 {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          var convert = new converter();

          System.out.print("Enter Binary number : ");
          int binary = sc.nextInt();
          int output = convert.BinarytoDecimal(binary);
          System.out.println("output : " + output);

          System.out.println("Enter decimal number : ");
          int decimal = sc.nextInt();
          int output2 = convert.DecimaltoBinary(decimal);
          System.out.println("output : "+ output2);

          sc.close();
     }
}

class converter {

     int BinarytoDecimal(int binary) {
          int mynum = binary;
          int decimal = 0, lastdigit, po = 0;

          while (mynum > 0) {
               lastdigit = mynum % 10;
               decimal = decimal + (lastdigit * (int) Math.pow(2, po));
               po++;
               mynum = mynum / 10;
          }
          return decimal;
     }

     int DecimaltoBinary(int decimal) {
          // int decinum = decimal;
          int binary=0 , pow=0;
          while(decimal>0){
               int rem = decimal % 2;

               binary = binary + (rem * (int)Math.pow(10, pow));

               pow++;
               decimal = decimal/2;
          }
          return binary;
     }

}