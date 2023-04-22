import java.util.*;

public class j19 {
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter String : ");
          String str = sc.nextLine();
          
          System.out.print("Enter character which you want to replace : ");
          char ch = sc.next().charAt(0);
          
          System.out.print("Enter character that you want to replace with : ");
          char ch1 = sc.next().charAt(0);

          String newstr = str.replace(ch, ch1);
          System.out.println("old srting = "+ str + "\nnew string = "+ newstr);

          sc.close();
     }
}
