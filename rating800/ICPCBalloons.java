package rating800;
import java.util.Scanner;
public class ICPCBalloons {
  static Scanner sc = new Scanner(System.in);
  public static void baloons() {
    int n = sc.nextInt();
    String s = sc.next();
    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      freq[ch - 'A']++;
    }
    int ans = 0;
    for(int i = 0;i<freq.length;i++){
      if(freq[i]>=1){
        ans+=(freq[i]+1);
      }
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
    int t = sc.nextInt();
    while (t > 0) {
      baloons();
      t--;
    }
    sc.close();
  }
}