package rating800;

import java.util.Scanner;

public class Pangram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next().toLowerCase();
    int[] arr = new int[26];
    for(int i = 0;i<str.length();i++){
      char ch = str.charAt(i);
      arr[ch-'a']++;
    }
    String ans = "YES";
    for(int i = 0;i<arr.length;i++){
      if(arr[i]==0){
        ans = "NO";
      }
    }

    System.out.println(ans);
    
    sc.close();
  }
}
