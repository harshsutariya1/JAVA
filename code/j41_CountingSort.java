public class j41_CountingSort {
     static void countingSort(int array[]){
          int largest = Integer.MIN_VALUE;
          for(int i = 0; i<array.length; i++){
               largest = Math.max(largest, array[i]);
          }

          int count[] = new int[largest+1];
          for(int i = 0; i<array.length; i++){
               count[array[i]]++;
          }

          int j = 0;
          for(int i = 0; i<count.length; i++){
               while(count[i]>0){
                    array[j] = i;
                    count[i]--;
                    j++;
               }
          }
     }

     public static void main(String args[]) {
          int array[] = { 7, 8, 1, 5, 4, 9, 3 };
          j38_SelectionSort.PrintArray(array);
          countingSort(array);
          j38_SelectionSort.PrintArray(array);
     }
}
