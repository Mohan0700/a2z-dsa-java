package basics.patterns;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        //1st part
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

        //2nd part
        for(int i=1;i<=rows;i++){
            //space printing
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            //stars printing
            for(int j=0;j<(2*(rows-i)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
