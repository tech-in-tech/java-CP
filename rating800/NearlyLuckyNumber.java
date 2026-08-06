package rating800;
import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int count = 0;

        while (num > 0) {
            long rem = num % 10;

            if (rem == 4 || rem == 7) {
                count++;
            }

            num /= 10;
        }

        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}