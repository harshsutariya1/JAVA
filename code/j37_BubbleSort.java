public class j37_BubbleSort {

     static void PrintArray(int array[]) {
          System.out.print("Array: { ");
          for (int i : array) {
               System.out.print(i + ", ");
          }
          System.out.println("\b\b }");
     }

     static void BubbleSort(int array[]) {
          System.out.println("Bubble Sorting...");
          int len = array.length, i, j, temp;
          for (j = 0; j < len; j++) {
               for (i = 0; i < len - 1; i++) {
                    if (array[i] > array[i + 1]) {
                         temp = array[i];
                         array[i] = array[i+1];
                         array[i+1] = temp;
                    }
               }
          }
     }

     public static void main(String args[]) {
          int array[] = { 7, 8, 1, 5, 4, 9,3};
          j36_ArraysAssignment.que1_isDoubleElements(array);
          PrintArray(array);
          BubbleSort(array);
          PrintArray(array);
     }
}