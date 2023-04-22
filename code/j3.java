//program to reverse any number...

public class j3 {
     public static void main(String[] args){
          int n = 56413; int rev = 0;
          //String s = "hss";
          while(n>0){
               int lastdigit = n%10;
               rev = (rev * 10) + lastdigit;
               // System.out.print(lastdigit + " ");
               n = n/10;
          }
          System.out.print(rev);
     }
}
