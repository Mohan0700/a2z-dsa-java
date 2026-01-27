package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size==0){
            System.out.println("No elements in Array");
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size-1;i++){
            list.add(sc.nextInt());
        }
        System.out.println(missingNumber02(list,size));
    }

    private static int missingNumber02(List<Integer> list, int size) {
        int ans = 0;
        for(int i=0;i<size-1;i++){
            ans=ans^(i+1)^list.get(i);
        }
        ans^=size;
        return ans;
    }

    private static int missingNumber01(List<Integer> list, int size) {
        int sum = size * (size+1)/2;
        for(int x:list){
            sum-=x;
        }
        return sum;
    }
}
