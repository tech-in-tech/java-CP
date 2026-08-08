package rating800;

import java.util.Scanner;

public class BeautifulYear {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int year = sc.nextInt();

    // 1987
    for(int i = year+1;i<=90000;i++){
      int [] arr = new int[10];
      int num = i;
      boolean unique = true;
      while (num>0) {
        int rem = num%10;
        arr[rem]++;
        num/=10;
      }
      for(int j = 0;j<10;j++){
        if(arr[j]>1){
          unique = false;
          break;
        }
      }
      if (unique) {
        System.out.println(i);
        break;
      }
    }
    sc.close();
  }
}
