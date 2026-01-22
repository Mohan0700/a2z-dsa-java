package basics.patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows , columns ;
        rows = sc.nextInt();
        columns = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==0||j==0||i==rows-1||j==columns-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
