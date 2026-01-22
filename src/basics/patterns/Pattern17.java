package basics.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //space printing
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }

            //alphabet printing

            char ch='A';
            for(int j=0;j<i;j++){
                System.out.print((char)(ch+j));
            }

            int count=i-2;
            for(int j=1;j<i;j++){
                System.out.print((char)(ch+count));
                count--;
            }
            System.out.println();
        }
    }
}
