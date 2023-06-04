public class j38_SelectionSort {
     static void PrintArray(int array[]) {
          System.out.print("Array: { ");
          for (int i : array) {
               System.out.print(i + ", ");
          }
          System.out.println("\b\b }");
     }

     static void selectionSort(int array[]) {
          System.out.println("Selection Sorting...");

          for (int i = 0; i < array.length - 1; i++) {
               int smallest = i;
               for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[smallest]) {
                         smallest = j;
                    }
               }
               int temp = array[i];
               array[i] = array[smallest];
               array[smallest] = temp;
          }
     }

     public static void main(String args[]) {
          int array[] = { 7, 8, 1, 5, 4, 9, 3 };
          PrintArray(array);
          selectionSort(array);
          // j37_BubbleSort.BubbleSort(array);
          PrintArray(array);
     }
}
