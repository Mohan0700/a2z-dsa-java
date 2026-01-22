package basics.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        char ch='A';
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
}
