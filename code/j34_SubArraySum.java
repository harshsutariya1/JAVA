// import java.util.*;
public class j34_SubArraySum {

     static void PrintArray(int array[]) {
          System.out.print("Array: { ");
          for (int i = 0; i < array.length; i++) {
               System.out.print(array[i] + ", ");
               if (i == array.length - 1) {
                    System.out.print("\b\b");
               }
          }
          System.out.print(" }");
     }

     static int FindSum(int array[], int start, int end) {
          int sum = 0;
          for (int i = start; i <= end; i++) {
               sum += array[i];
          }
          return sum;
     }

     static int MaxSubArraySum(int array[]) {
          int maxSum = Integer.MIN_VALUE, sum;
          for (int i = 0; i < array.length - 1; i++) { // defines starting point.
               for (int j = i + 1; j < array.length; j++) { // defines ending point.
                    sum = FindSum(array, i, j); // Finding sum of current subArray.
                    if (sum > maxSum) {
                         maxSum = sum;
                    }
               }
          }
          return maxSum;
     }

     public static void main(String args[]) {
          int arr[] = { 0, 1, -2, 3, 4 };
          PrintArray(arr);
          System.out.println();
          System.out.println("Max Sub Array Sum: " + MaxSubArraySum(arr));
     }
}
