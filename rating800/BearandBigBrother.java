package rating800;

import java.util.Scanner;

public class BearandBigBrother {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int numberOfYears = 0;
    while(a<=b){
      a*=3;
      b*=2;
      numberOfYears++;
    }
    System.out.println(numberOfYears);
    sc.close();
  }
}
