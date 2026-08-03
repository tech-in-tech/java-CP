package rating800;

import java.util.Scanner;

public class BeautifulMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[5][5];
    // Input arr
    for(int i = 0;i<5;i++){
      for(int j = 0;j<5;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    // Finding index of 1
    int idxi = -1;
    int idxj = -1;
     for(int i = 0;i<5;i++){
      for(int j = 0;j<5;j++){
        if(arr[i][j]==1){
          idxi = i+1;
          idxj = j+1;
        }
      }
    }
    int moves = Math.abs(idxi-3)+Math.abs(idxj-3);
    System.out.println(moves);
    sc.close();
  }
}
