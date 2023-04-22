import java.util.Arrays;      //binary search

public class j23 {
     static void array(int array[]){
          for(int i = 0; i<array.length; i++){
               System.out.print(array[i] + " ");
          }
     }
     public static void main(String args[]){
          int arr[] = {2,3,4,5,6,8,9};
          // int key = 5;
          // array(arr);
          System.out.print(Arrays.toString(arr));
          // System.out.print(Arrays.sort(arr));
     }
}
