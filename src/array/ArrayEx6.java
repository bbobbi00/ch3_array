package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        
        //학생 10명의 점수
        //배열을 이용해서 점수를 관리
        int score[] = {100,99,98,97,96,95,94,93,92,91};

        //최고점수/최저점수
        
       int max = score[0];
       int min = score[9];

       for (int i = 1; i < score.length; i++) {
        if (max<score[i]) max=score[i];
        if (min>score[i]) min=score[i];
       }
       System.out.println(max);
       System.out.println(min);

       //총합/평균

       int sum=(score[0]+score[9])*5;
       double avg=(double)sum/score.length;

       System.out.println(sum);
       System.out.println(avg);


    }
    
}
