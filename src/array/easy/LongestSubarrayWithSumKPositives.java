package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;

public class LongestSubarrayWithSumKPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int length = subarray02(list,k);
        System.out.println(length);
    }



    //Brute Force Approach -> Calculate sum of all possible subarrays and match their sum with K .
    private static int subarray01(List<Integer> list, int k) {
        int size = 0;
        for(int i=0;i<list.size();i++){
            int sum = 0;
            for(int j=i;j<list.size();j++){
                sum+=list.get(j);
                if(sum==k){
                    size = max(size , j-i+1);
                }
            }
        }
        return size;
    }
    //Optimal Approach -> Using 2 pointers O(n)
    private static int subarray02(List<Integer> list, int k) {
        int i=0,j=0;
        int sum=0;
        int size = 0;
        while(j<list.size()){
            sum+=list.get(j);

            while(sum>k){
                sum-=list.get(i);
                i++;
            }

            if(sum==k){
                size = max(size , j-i+1);
            }
            j++;
        }
        return size;
    }

}
