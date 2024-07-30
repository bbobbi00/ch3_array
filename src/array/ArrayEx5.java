package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        
        //배열명 arr 선언 후 생성
        // 숫자 1,2,3,4,5 담음
        // 기존 배열의 크기의 두 배의 크기를 가지는 새로운 배열 생성
         
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[arr.length*2];

        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
            
        }

        int[] temp2 = new int[arr.length*2];
        System.arraycopy(arr, 0,temp2 , 0, arr.length);
        System.out.println(Arrays.toString(temp2));


    }
    
}
