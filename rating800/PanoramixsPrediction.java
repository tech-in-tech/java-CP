package rating800;

import java.util.Scanner;
public class PanoramixsPrediction {
  public static boolean checkPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = -1;
    for (int i = n + 1; i <= m; i++) {
      if (checkPrime(i)) {
        a = i;
        break;
      }
    }
    if (m == a) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}