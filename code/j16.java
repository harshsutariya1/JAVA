import java.util.Scanner;

class fab {
  Scanner sc = new Scanner(System.in);
  int num;
  int arr[] = new int[num];

  void takeinput() {
    System.out.print("Enter num : ");
    num = sc.nextInt();
  }

  void output() {
    if (num == 1) {
      System.out.println("0");
    } else if (num <= 0) {
      System.out.println("");
    } else {
      for (int i = 0; i < num; i++) {
        if (i == 0 || i == 1) {
          arr[i] = i;
          System.out.println(arr[i] + " ");
        } else {
          arr[i] = arr[i - 1] + arr[i - 2];
          System.out.println(arr[i] + " ");
        }
        System.out.println();
      }
    }

  }
}

public class j16 {
  public static void main(String[] args) {
    fab obj = new fab();
    obj.takeinput();
    obj.arr = new int[obj.num];
    obj.output();

  }
}