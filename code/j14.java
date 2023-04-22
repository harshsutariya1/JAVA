import java.util.*;

public class j14 {

    public static Scanner sc = new Scanner(System.in);

    public static int b;
    public static int h;

    static int takeb() {
        return b = sc.nextInt();
    }

    static int takeh() {
        return h = sc.nextInt();
    }

    static void output() {
        System.out.print(b * h);
    }

    public static void main(String[] args) {

        takeb();
        takeh();
        if (b <= 0 || h <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
        output();

        sc.close();
    }
}