package rating800;

import java.util.Scanner;

// 1A
public class TheatreSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    long a = sc.nextLong();
    
    long ans =(long)(Math.ceil((double)n/a)*Math.ceil((double)m/a));
    
    // n = 9,m = 6,a = 4
    // 3 2    

    System.out.println(ans);


    sc.close();
  }  
}




// Rec shape
// size = n*m
// size of square granite = a*a

// 3*6