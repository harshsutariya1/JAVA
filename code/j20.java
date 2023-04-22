//average of n number of list
import java.util.*;

class arr{
     Scanner sc = new Scanner(System.in);
     // ArrayList al = new ArrayList<>();
     int arr[];
     int n , sum; double avg;

     void takeinput(){
          System.out.print("how many number you want to add to array : ");
          n = sc.nextInt();
          arr = new int [n];
          for(int i = 0; i<n; i++){
               System.out.print("Enter "+i+"th number : ");
               // al.add(i, sc.nextInt());
               arr[i] = sc.nextInt();
               // sum += (int) al.get(i);
               sum += arr[i];
          }
     }

     void output(){
          avg = sum / (float) n;
          System.out.println("avg : "+avg);
     }
     
}

public class j20 {
     public static void main(String[] args) {
          arr array = new arr();
          array.takeinput();
          array.output();
     }
}
