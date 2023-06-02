public class j33_SubArray {

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

     static void PrintArray(int array[], int start, int end) {
          System.out.print("{ ");
          for (int i = start; i <= end; i++) {
               System.out.print(array[i] + ", ");
               if (i == end) {
                    System.out.print("\b\b");
               }
          }
          System.out.print(" }");
     }

     static void printSubArrays(int array[]) {
          for (int i = 0; i < array.length - 1; i++) { // defines starting point.
               for (int j = i + 1; j < array.length; j++) { // defines ending point.
                    PrintArray(array, i, j); // prints array.
                    System.out.println();
               }
               System.out.println();
          }
     }

     public static void main(String args[]) {
          int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
          PrintArray(arr);
          System.out.println();
          printSubArrays(arr);
     }
}
