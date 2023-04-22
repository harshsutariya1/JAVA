import java.util.*;
public class j5 {
     public static void main(String[] args){
          int factorial = 1;

          Scanner sc = new Scanner(System.in);
          
          System.out.print("Enter any number : ");
          int num = sc.nextInt();

          if(num==0 && num == 1){
               factorial = 1;
          }else{
               for(int i = 2; i<=num; i++){
                    factorial *= i;
               }
          }
          
          System.out.printf("factorial of %d = %d", num, factorial);


          sc.close();
     }
}
