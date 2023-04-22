import java.util.*;
public class j10{
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);

          System.out.print("enter a : ");
          double n = sc.nextDouble();
          
          n++;
          int pw = (int) Math.pow(n,2);
          System.out.print(pw);

          sc.close();
     }
}