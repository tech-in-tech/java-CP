package rating800;

import java.util.Scanner;

// 236A
public class BoyOrGirl {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String newStr = "";
    // int count = 0;
    for(int i = 0;i<str.length();i++){
      char ch = str.charAt(i);
      if(newStr.contains(String.valueOf(ch))==false){
        newStr+=ch;
      }
    }
    if(newStr.length()%2==0){
      System.out.println("CHAT WITH HER!");
    }
    else{
      System.out.println("IGNORE HIM!");
    }

    sc.close();
  }  
}
