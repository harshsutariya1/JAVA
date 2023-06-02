public class j31_ReverseArray {

     static void Print_Array(int array[]){
          System.out.print("[");
          for(int n: array){
               System.out.print(n+", ");
          }
          System.out.print("\b\b]");
     }

     static void reverse_array(int array[]){
          int len = array.length, mid = len / 2, end = len-1, temp;
          for(int i = 0; i < mid; i++){
               temp = array[i];
               array[i] = array[end];
               array[end] = temp;
               end--;
          }
     }

     public static void main(String args[]){
          int arr[] = {1,2,5,3,4,8,9,7,6};
          Print_Array(arr);
          reverse_array(arr); //It changes inside original array.
          System.out.println();
          Print_Array(arr);
     }
}
