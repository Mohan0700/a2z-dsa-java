package basics.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        //1st part
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part
        for(int i=0;i<rows-1;i++){
            for(int j=i;j<rows-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
