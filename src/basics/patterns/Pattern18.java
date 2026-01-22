package basics.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        char ch='A';
        for(int i=0;i<rows;i++){
            int count = rows - i - 1;
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+count));
                count++;
            }
            System.out.println();
        }
    }
}
