package rating800;

import java.util.Scanner;

public class ShortSubstrings {
  static Scanner sc = new Scanner(System.in); 
  public static void solve() {
    String b = sc.next();
    String ans = "";
    ans+=b.substring(0,2);
    for(int i = 3;i<b.length();i+=2){
      ans+=b.charAt(i);
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    int t = sc.nextInt();
    while (t>0) {
      solve();
      t--;
    }
  }
}
