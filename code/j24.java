
//stack implementation in java
import java.util.*;

public class j24 {
     Scanner sc = new Scanner(System.in);
     int array[];
     int top;
     int capacity; // size of stack.

     j24(int size) { // constructor.
          array = new int[size];
          capacity = size;
          top = -1;
     }

     public Boolean isEmpty() {
          return top == -1;
     }

     public Boolean isFull() {
          return top == capacity - 1;
     }

     public void printstack() {
          if (top == -1) {
               System.out.println("Stack is Empty.");
          }
          for (int i = top; i >= 0; i--) {
               System.out.printf("Element[%d] : %d\n", i, array[i]);
          }
     }

     public int size() { // returns size of stack.
          return top + 1;
     }

     public void push() {
          if (isFull()) {
               System.out.println("stack overflow...");
               return;
          }
          System.out.print("Enter element : ");
          int x = sc.nextInt();
          System.out.println("Inserted element : " + x);
          array[++top] = x;
     }

     public void pop() {
          if (isEmpty()) {
               System.out.println("stack is empty.");
               return;
          }
          array[top--] = 0;
     }

     public void peek(){
          if (isEmpty()) {
               System.out.println("stack is empty.");
               return;
          }
          System.out.println(array[top]);
     }

     public void runstack() {
          while (true) {
               System.out.println("\nchoose any option :");
               System.out.println("1. push element.");
               System.out.println("2. pop/delete element.");
               System.out.println("3. isEmpty or not.");
               System.out.println("4. isFull or not.");
               System.out.println("5. show stack");
               System.out.println("6. peek");
               System.out.println("7. quite program.");
               System.out.print("Enter your option : ");
               int con = sc.nextInt();

               switch (con) {
                    case 1:
                         push();
                         break;
                    case 2: // deletes an last in item.
                         pop();
                         break;
                    case 3: // returns true or false.
                         System.out.println(isEmpty());
                         break;
                    case 4:
                         System.out.println(isFull());
                         break;
                    case 5:
                         // System.out.println("you have choosed peek.");
                         printstack();
                         break;
                    case 6 : 
                         peek();
                    case 7:
                         System.exit(0);
               }

          }
     }

     public static void main(String str[]) {
          j24 stack = new j24(4); // defining size of stack.
          stack.runstack();
     }
}