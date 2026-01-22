package basics.Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

//        Integer n = num;
//        String str = n.toString();
//        System.out.println(str.length());

//        System.out.println((int)(Math.log10(num)+1));

        while(num!=0){
            count++;
            num/=10;
        }

        System.out.println(count);
    }
}
