package array;

import java.util.Arrays;

//알고리즘-정렬
//        -선택정렬,버블정렬

public class ArrayEx10 {
    public static void main(String[] args) {
        int arr[] = {25,85,55,65,5,3};

        int i=0,j=0;
        for (i=0; i < arr.length; i++) {
            int min_idx = i; // i는 총 6번 돌음
            //최솟값을 가지고 있는 인덱스 찾기
            for ( j= i+1; j < arr.length; j++) {
                if (arr[j]<arr[min_idx]) { //j번째 값(3)이 0번째 값(25)보다 작을때, 최솟값은 j가 됨
                    min_idx=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            
        }
        System.out.println(Arrays.toString(arr));

         // 자바가 제공하는 sort
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    }

}
