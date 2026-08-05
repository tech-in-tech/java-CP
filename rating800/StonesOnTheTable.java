package rating800;

import java.util.Scanner;

public class StonesOnTheTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // solved by using two pointer approch
    int n = sc.nextInt();
    String str = sc.next();
    int ans = 0;
    int r = 0, l = 1;
    while (l < n) {
      if (str.charAt(r) == str.charAt(l))
        ans++;
      r++;
      l++;
    }
    System.out.println(ans);

    sc.close();
  }
}
