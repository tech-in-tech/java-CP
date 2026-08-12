package rating800;
import java.util.Scanner;
public class Tram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int currentPassengers = 0;
    int maxPassengers = 0;

    for(int i = 0;i<n;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      currentPassengers-=a;
      currentPassengers+=b;

      if(currentPassengers>maxPassengers){
        maxPassengers = currentPassengers;
      }
    }
    System.out.println(maxPassengers);
    
    sc.close();
  }
}
