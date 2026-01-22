package basics.patterns;

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //space printing
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }

            //stars printing
            for(int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
