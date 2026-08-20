package rating800;

import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
  static Scanner sc = new Scanner(System.in);
  public static void solve() {
    int n = sc.nextInt();
    String str = sc.next();

    String t = "Timur";
    char[] arr1 = t.toCharArray();
    char[] arr2 = str.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    String st1 = new String(arr1);
    String st2 = new String(arr2);
    if(st1.equals(st2)){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }

  public static void main(String[] args) {

    int t = sc.nextInt();
    while (t > 0) {
      solve();
      t--;
    }
  }
}
