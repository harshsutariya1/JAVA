import java.util.*;

public class j40_InbuiltSorting {
     public static void main(String args[]) {
          int array[] = { 7, 8, 1, 5, 4, 9, 3 };
          j38_SelectionSort.PrintArray(array);
          Arrays.sort(array,1,5);
          j38_SelectionSort.PrintArray(array);
          Arrays.sort(array);
          j38_SelectionSort.PrintArray(array);

          Integer arr[] = { 7, 8, 1, 5, 4, 9, 3 };
          Arrays.sort(arr, Collections.reverseOrder());
          
     }
}
