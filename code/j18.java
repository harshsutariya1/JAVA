//greater than 3 numbers...
import java.util.*;
class big{
     Scanner sc = new Scanner(System.in);
     int one, two, three;
     int big;

     void takeinput(){
          System.out.print("Enter first number : ");
          one = sc.nextInt();
          System.out.print("Enter second number : ");
          two = sc.nextInt();
          System.out.print("Enter third number : ");
          three = sc.nextInt();
         
     }

     void greater(){
          if(one>two){
               if(one>three){
                    big = one;
               }
          }else{ //two>one
               if(two>three){
                    big = two;
               }else{//three>two>one
                    big = three;
               }
          }
     }

     int output(int b){
          System.out.println(big+" is biggest number");
          return 0;
     }
}
public class j18 {
     public static void main(String[] args) {
          big big = new big();
          big.takeinput();
          big.greater();
          big.output(big.big);
     }
     
}
