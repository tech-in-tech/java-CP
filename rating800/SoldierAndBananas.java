package rating800;

import java.util.Scanner;

// 546A
public class SoldierAndBananas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int totalRequiredDollars = 0;
    for (int i = 1; i <= w; i++) {
      totalRequiredDollars += i * k;

    }
    if (totalRequiredDollars <= n) {
      System.out.println(0);
    } else {

      System.out.println(totalRequiredDollars - n);
    }

    sc.close();
  }
}
// k =3
// w = 4
// 3 + 2*3 + 3*3 + 4*3