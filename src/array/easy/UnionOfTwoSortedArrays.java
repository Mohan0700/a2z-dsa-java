package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<m;i++){
            list2.add(sc.nextInt());
        }

        List<Integer> union = unionOfArray(list1,list2,n,m);
        System.out.println(union);
    }
    //Brute force -> We can get a sorted set and loop over both the arrays and add those members in the set
    // Post that we can loop over the elements in set and copy the same in union array.
    //Optimal Approach - 2 pointers O(n+m)
    private static List<Integer> unionOfArray(List<Integer> list1, List<Integer> list2, int n, int m) {
        int i=0,j=0;
        List<Integer> union = new ArrayList<>();
        while(i<n && j<m){
            if(list1.get(i)<=list2.get(j)){
                if(union.size()==0 || union.get(union.size()-1)!=list1.get(i)){
                    union.add(list1.get(i));
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=list2.get(j)){
                    union.add(list2.get(j));
                }
                j++;
            }
        }
        while(i<n){
            if(union.size()==0 || union.get(union.size()-1)!=list1.get(i)){
                union.add(list1.get(i));
            }
            i++;
        }
        while(j<m){
            if(union.size()==0 || union.get(union.size()-1)!=list2.get(j)){
                union.add(list2.get(j));
            }
            j++;
        }
        return union;
    }
}
