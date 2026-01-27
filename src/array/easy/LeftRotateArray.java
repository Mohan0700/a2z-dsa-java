package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        if(size<=1){
            return;
        }
        int k=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        k %= size;
        //rotateArray01(list,k);
        rotateArray02(list,k);
        System.out.println(list);
    }

    //Brute force Approach -> Outer loop is number of times we want to rotate the array
    // inner loop is rotating array left by one place .
    // O(size*K)
    private static void rotateArray01(List<Integer> list, int k) {
        for(int i=0;i<k;i++){
            int temp=list.get(0);
            for(int j=1;j<list.size();j++){
                list.set(j-1,list.get(j));
            }
            list.set(list.size()-1,temp);
        }
    }

    //Optimal Approach
    private static void rotateArray02(List<Integer> list, int k) {
        reverse(list,0,k-1);
        reverse(list,k,list.size()-1);
        reverse(list,0,list.size()-1);
    }

    private static void reverse(List<Integer> list, int i, int j) {
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}
