package rating800;

import java.util.Scanner;

public class DominoPilling {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int areaOfBoard = m * n;
    // if(areaOfBoard%2==0){
    System.out.println(areaOfBoard / 2);
    // }
    // else{
    // System.out.println((areaOfBoard/2)-1);
    // }

    sc.close();
  }
}
