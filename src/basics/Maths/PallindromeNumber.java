package basics.Maths;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println(false);
            System.exit(0);
        }
        int actualNum=num;
        int revNum = 0;

        while(num!=0){
            int rem = num%10;
            if(revNum > (Integer.MAX_VALUE)/10 || revNum < (Integer.MIN_VALUE)/10) {
                System.out.println("Reversing the number is causing overflow");
                System.exit(0);
            }
            revNum = revNum*10 + rem;
            num/=10;
        }
        System.out.println(revNum==actualNum);
    }
}
