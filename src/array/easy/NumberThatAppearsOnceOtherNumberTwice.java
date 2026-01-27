package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberThatAppearsOnceOtherNumberTwice {
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
        System.out.println(findNum(list));
    }
    //Brute Force -> pick each element of the array and loop over the array to count if it appears more than once
    // or not . O(n*n)
    //Better -> Use a map to keep count of each element . and then loop through the map to find the element whose
    //count is 1 .
    //Optimal Approach
    private static int findNum(List<Integer> list) {
        int ans=0;
        for(int x:list){
            ans ^= x;
        }
        return ans;
    }
}
