package rating800;

import java.util.Scanner;

public class AntonAndDanik {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    int Acount = 0,Dcount = 0;
    for(int i = 0;i<str.length();i++){
      if(str.charAt(i)=='A'){
        Acount++;
      }
      else{
        Dcount++;
      }
    }
    if(Acount>Dcount){
      System.out.println("Anton");
    }
    else if(Dcount>Acount){
      System.out.println("Danik");
    }
    else{
      System.out.println("Friendship");
    }
    sc.close();
  }
}
