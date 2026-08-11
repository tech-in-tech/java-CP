package rating800;

import java.util.Scanner;

public class Word {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    String str = sc.next();
    int countLower = 0;
    int countUpper = 0;
    for(int i = 0;i<str.length();i++){
      char ch = str.charAt(i);
      if(Character.isUpperCase(ch)){
        countUpper++;
      }
      else{
        countLower++;
      }
    }
    if(countLower>=countUpper){
      System.out.println(str.toLowerCase());
    }
    else{
      System.out.println(str.toUpperCase());
    }
    sc.close();

  }
}
