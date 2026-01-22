package basics.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=0;i<rows;i++){
            char ch = 'A';
            for(int j=0;j<rows-i;j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
