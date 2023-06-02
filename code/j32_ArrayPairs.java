class j32_ArrayPairs {

     static void printArray(int array[]) {
          System.out.print("Array: { ");
          for (int i = 0; i < array.length; i++) {
               System.out.print(array[i] + " ");
          }
          System.out.println("}");
     }

     static void printPairs(int array[]) {
          for (int i = 0; i < array.length - 1; i++) {
               for (int j = i + 1; j < array.length; j++) {
                    System.out.print("( "+array[i]+", "+array[j]+" )  ");
               }
               System.out.println();
          }
     }

     public static void main(String args[]) {
          // int arr[] = new int [5];
          int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
          printArray(arr);
          printPairs(arr);
     }
}