package basics.patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=0;i<rows;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < 2 * (rows - i - 1); j++) {
                System.out.print(" ");
            }
            int count = i + 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(count--);
            }
            System.out.println();
        }
    }
}
