// 1030A
package rating800;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "EASY";
    int [] arr = new int[n];
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0;i<n;i++){
      if(arr[i]==1){
        ans = "HARD";
        break;
      }
    }
    System.out.println(ans);
    sc.close();
  }
}