package rating800;

import java.util.Scanner;

public class QueueAtTheSchool {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    String str = sc.next();
    char[] ch = str.toCharArray();
    while (t>0) {
      for(int i = 0;i<str.length()-1;i++){
        // BGGBG
        if(ch[i]=='B' && ch[i+1]=='G'){
          char temp = ch[i];
          ch[i] = ch[i+1];
          ch[i+1] = temp;
          i++;
        }
      }
      t--;
    }
    System.out.println(new String(ch));
    sc.close();
  }
}
