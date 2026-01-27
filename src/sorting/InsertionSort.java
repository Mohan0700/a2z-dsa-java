package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        for(int i=1;i<size;i++){
            int j=i;
            while(j-1>=0 && list.get(j)<list.get(j-1)){
                int temp = list.get(j);
                list.set(j, list.get(j-1));
                list.set(j-1,temp);
                j--;
            }
        }
        for(Integer x:list){
            System.out.print(x + " ");
        }
    }
}

//5 4 3 2 1
//5 4 3 2 1
//4 5 3 2 1
//3 4 5 2 1
//2 3 4 5 1
//1 2 3 4 5