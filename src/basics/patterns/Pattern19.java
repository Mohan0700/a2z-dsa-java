package basics.patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=0;i<rows;i++){
            //stars
            for(int j=i;j<rows;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=i;j<rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<2*(rows-i-1);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
