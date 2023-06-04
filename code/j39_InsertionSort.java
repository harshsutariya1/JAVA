public class j39_InsertionSort {
     static void insertionSort(int array[]) {
          System.out.println("Insertion Sorting...");
          for (int i = 1; i < array.length; i++) {
               int current = array[i];
               int previous = i - 1;
               // finding currect position to insert.
               while (previous >= 0 && array[previous] > current) {
                    array[previous + 1] = array[previous];
                    previous--;
               }
               array[previous + 1] = current;
          }
     }

     public static void main(String args[]) {
          int array[] = { 7, 8, 1, 5, 4, 9, 3 };
          j38_SelectionSort.PrintArray(array);
          insertionSort(array);
          j38_SelectionSort.PrintArray(array);
     }
}
