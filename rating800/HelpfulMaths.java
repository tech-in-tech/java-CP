package rating800;
import java.util.*;
// 339A
public class HelpfulMaths {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String numString  = "";
    for(int i = 0;i<str.length();i++){
      if(str.charAt(i)!='+'){
        numString+=str.charAt(i);
      }
    }
    char[] arr = numString.toCharArray();
    Arrays.sort(arr);
    String sortedString = new String(arr);
    // System.out.println(sortedString);
    String ans = "";
    for(int i = 0;i<sortedString.length();i++){
      ans+=sortedString.charAt(i);
      ans+='+';
    }
    StringBuilder sb = new StringBuilder(ans);
    sb.deleteCharAt(sb.length()-1);
    System.out.println(sb);
    sc.close();
  }
}
