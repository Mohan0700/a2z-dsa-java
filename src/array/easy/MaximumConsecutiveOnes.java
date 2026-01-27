package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size==0){
            System.out.println("No elements in Array");
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println(maxOnes(list));
    }

    private static int maxOnes(List<Integer> list) {
        int maxCount = 0;
        int count=0;
        int i=0;
        while(i<list.size()){
            if(list.get(i)==1){
                count++;
                maxCount = max(count,maxCount);
            }
            else{
                count=0;
            }
            i++;
        }
        return maxCount;
    }
}
