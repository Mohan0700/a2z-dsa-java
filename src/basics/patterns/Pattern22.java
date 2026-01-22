package basics.patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows ;
        rows = sc.nextInt();
        int leftCol = 0;
        int rightCol = 2*rows-2;
        int topRow = 0;
        int bottomRow = 2*rows-2;
        for(int i=0;i<2*rows-1;i++){
            for(int j=0;j<2*rows-1;j++){
                int ans = Math.min(Math.min(j-leftCol,rightCol-j),Math.min(i-topRow,bottomRow-i));
                System.out.print(rows-ans);
            }
            System.out.println();
        }
    }
}
