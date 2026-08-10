package rating800;

import java.util.Scanner;

public class Magnets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.next();
    }
    int grp = 1;
    for(int i = 1;i<arr.length;i++){
      if(!arr[i-1].equals(arr[i])){
        grp++;
      }
    }
    System.out.println(grp);
    sc.close();
  }
}
