import java.util.Scanner;

public class j30_BinarySearch {
     static Scanner sc = new Scanner(System.in);

     public static int Binary_Search(int Array[], int key) {
          int start = 0, end = Array.length-1, mid;
          while (start<=end) {
               mid = (start+end)/2; //index
               if(Array[mid]==key){
                    return mid;
               }
               if(Array[mid]<key){
                    start = mid+1;
               }
               if(Array[mid]>key){
                    end = mid-1;
               }
          }
          return  -1;
     }

     static void Enter_Marks(int array[]) {
          for (int i = 0; i < array.length; i++) {
               System.out.printf("Enter marks[%d]: ", i);
               array[i] = sc.nextInt();
          }
     }

     static void show_marks(int array[]) {
          System.out.print("[");
          for (int n : array) { // for-each loop.
               System.out.print(n + ", ");
          }
          System.out.print("\b\b]"); // "\b" to use back-space.
     }

     public static void main(String args[]) {
          System.out.println("Enter Array (in order): ");
          System.out.print("Enter length of arrray = ");
          int marks[] = new int[sc.nextInt()]; // creating array.
          Enter_Marks(marks);
          System.out.print("Your Array = ");
          show_marks(marks);
          System.out.print("\nEnter key to find it's index: ");
          int index = Binary_Search(marks, sc.nextInt());
          
          if(index!=-1){
               System.out.printf("Your key found at %dth index.",index);
          }else{
               System.out.print("Key not found!!!");
          }
     }
}
