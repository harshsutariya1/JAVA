public class j11 {
     static int factorial(int n){
          int fac = 1;
          for(int i = 1; i<=n; i++){
               fac *= i;
          }
          return fac;
     }
     public static void main(String args[]){
          int num = Integer.parseInt(args[0]);
          int factorial = (num==0 || num ==1)? 1 : factorial(num);

          System.out.println(factorial);
     }
}
