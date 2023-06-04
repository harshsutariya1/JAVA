public class j36_ArraysAssignment {

     static void que1_isDoubleElements(int array[]){
          boolean isDouble = false;
          for(int i = 0; i<array.length; i++){
               for(int j = 0; j<array.length; j++){
                    if(i==j){
                         continue;
                    }
                    if(array[i]==array[j]){
                         isDouble = true;
                    }
               }
          }
          System.out.println("is Double Elements output: "+isDouble);
     }

     static void que2_elementOnIndex(int array[], int element){
          int index=-1;
          for(int i = 0; i<array.length; i++){
               if(element==array[i]){
                    index = i;
                    break;
               }
          }
          if(index==-1){
               System.out.println("Element not found");
          }else
               System.out.println(element+" is on index "+index);
     }

     public static void main(String args[]){
          // int nums[] = {1,2,3,1};
          int nums[] = {1, 7, 3, 8, 4, 9, 2, 46, 22};
          que1_isDoubleElements(nums);
          que2_elementOnIndex(nums, 2);

     }
}
