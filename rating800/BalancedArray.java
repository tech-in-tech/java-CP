package rating800;

import java.util.Scanner;

public class BalancedArray {
  static Scanner sc = new Scanner(System.in);
  public static void solve() {
    int n = sc.nextInt();
    int k = n/2;
    int [] arr = new int[n];
    if(k%2!=0){
      System.out.println("NO");
    }
    else{
      System.out.println("YES");
      int idx = 0;
      int esum = 0;
      for(int i = 2;i<=n;i+=2){
        if(i%2==0){
          arr[idx] = i;
          esum+=i;
        }
        idx++;
      }
      int osum = 0;
      int idx2 =1;
      for(int i = 1;i<n-1;i+=2){
        if(i%2!=0){
          arr[idx] = i;
          osum+=i;
        }
        idx++;
      }
      arr[n-1] = esum-osum;
      for(int i = 0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

  
  }
  public static void main(String[] args) {
    
    int t = sc.nextInt();
    while(t>0){
      solve();
      t--;
    }
  }
}