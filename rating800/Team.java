package rating800;

import java.util.Scanner;

public class Team {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    while (n != 0) {
      int[] arr = new int[3];
      int oneCount = 0;
      for (int i = 0; i < 3; i++) {
        arr[i] = sc.nextInt();

        if (arr[i] == 1) {
          oneCount++;
        }
      }
      if (oneCount >= 2) {
        ans++;
      }
      n--;
    }
    System.out.println(ans);
    sc.close();
  }
}
