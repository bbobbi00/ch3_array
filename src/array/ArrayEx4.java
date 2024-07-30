package array;

import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {
        
        //'a','b','c','d'

        char[] chArr = {'a','b','c','d'};
        System.out.println(chArr);

        int[] intArr = {1,2,3,4,5};
        System.out.println(intArr);
        System.out.println(Arrays.toString(intArr));

        //배열 복사
        int[] temp = new int[intArr.length*2];
        for (int i = 0; i < intArr.length; i++) {
           temp[i] = intArr[i];
        }
        intArr = temp;
        System.out.println("복사 후"+Arrays.toString(intArr));

        String[] strArr = {"abcd"};
        System.out.println(strArr);
        System.out.println(Arrays.toString(strArr));
    }
    
}
