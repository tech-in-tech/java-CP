package rating800;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
                ans.append('0');
            } else {
                ans.append('1');
            }
        }

        System.out.println(ans);
        sc.close();
    }
}