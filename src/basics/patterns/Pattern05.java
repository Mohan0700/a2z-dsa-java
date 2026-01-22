package basics.patterns;

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
