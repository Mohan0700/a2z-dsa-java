package basics.patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows , columns ;
        rows = sc.nextInt();
        columns = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
