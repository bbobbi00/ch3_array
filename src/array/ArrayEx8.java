package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        
        //45개 정수 값을 저장하기 위한 배열을 생성
        int numArr[] = new int[45];

        //1~45 담기
        for (int i = 0; i < numArr.length; i++) {
           numArr[i] = i+1; 
        }
        System.out.println(Arrays.toString(numArr));

        int temp = 0;

        //0~5 까지의 숫자만 무작위로 위치 바꾸기
        for (int i = 0; i < 6; i++) {
            
            //무작위 숫자 0~44
            int num = (int)(Math.random()*45);

            temp = numArr[i];
            numArr[i] = numArr[num];
            numArr[num] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
    
}
