package rating800;

import java.util.Scanner;

public class MishkaAndGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mcount = 0;
    int ccount = 0;
    for(int i = 0;i<n;i++){
      int m =sc.nextInt();
      int c =sc.nextInt();
      if(m>c){
        mcount++;
      }
      else if(c>m){
        ccount++;
      }
      else{
        mcount++;
        ccount++;
      }
    }
    if(mcount>ccount){
      System.out.println("Mishka");
    }
    else if(ccount>mcount){
      System.out.println("Chris");
    }
    else{
      System.out.println("Friendship is magic!^^");
    }
    sc.close();
  }
}
