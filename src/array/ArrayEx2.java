package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        
        int[] score = new int[5]; // 길이가 5인 int 배열(인덱스 0)+ 초기값=0

        // 배열의 초기값 변경
        score[0] =98;
        score[1] =88;
        score[2] =78;
        score[3] =68;
        score[4] =58;


        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        for (int i : score) {
            System.out.println(i);
        }


    }
    
}
