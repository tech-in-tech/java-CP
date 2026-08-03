package rating800;

import java.util.Scanner;

public class PetyaAndStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    int ans = str1.compareTo(str2);
    // if str1> ans = positive
    // if str1< ans = negative
    // if str1==str2 ans = 0
    if(ans<0){
      System.out.println("-1");
    }
    else if(ans>0){
      System.out.println("1");
    }
    else{
      System.out.println("0");
    }
    sc.close();
  }
  
}