package basics.patterns;

import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();

        for(int i=0;i<rows;i++){
            int count = 1;
            for(int j=i;j<rows;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
