public class j22 { //linear search
     
     static int linearindex(int array[], int n){
          int len = array.length;
          for(int i = 0; i<len; i++){
               if(array[i] == n){
                    return i;
               }
          }
          return -1;
     }

     public static void main(String args[]){
          int arr[] = {1,5,4,8,7,9,3,2,6};
          int n = 7;               //item to be found.
          int index = linearindex(arr, n);
          if(index == -1){
               System.out.println("Element not found...");
          }else{
               System.out.println("Your element : "+n+" is found at : "+index+"th index number.");
          }
     }
}
