import java.util.*;

public class areaofcircle{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter radius: ");
          float r = sc.nextFloat();
          double area = 3.14 * r * r;

          System.out.print("area of circle is " + area);
     }
}