package rating800;

import java.util.Scanner;

// 1328A
public class DivisibilityProblem {
  static Scanner sc = new Scanner(System.in);

  public static void devision() {
    int a = sc.nextInt();
    int b = sc.nextInt();

    int rem = a % b;

    if (rem == 0) {
      System.out.println(0);
    } else {
      System.out.println(b - rem);
    }
  }

  public static void main(String[] args) {
   
    int t = sc.nextInt();
    while (t > 0) {
      devision();
      t--;
    }
    sc.close();
  }
}
