package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        
        //int[] score = new int[5]; // 길이가 5인 int 배열(인덱스 0)+ 초기값=0

        // 배열의 초기값 변경
        // score[0] =98;
        // score[1] =88;
        // score[2] =78;
        // score[3] =68;
        // score[4] =58;

        // 배열 초기값이 정해진 경우, 대괄호 안에 숫자 X
        int score[] = new int[]{98,88,78,68,58};
        int score2[] = {98,88,78,68,58};

        // 배열 사이즈 변경 ==> 불가능
        // 처음에 생성된 크기 변경은 불가능
        // 더 큰 배열을 만들고, 기존 배열을 새로운 배열에 복사

        int score3[][] = {{78,98},{88,68}};
        for (int i = 0; i < score3.length; i++) {
            for (int j = 0; j < score3[i].length; j++) {
                System.out.print(score3[i][j]+"\t");
            }
            System.out.println();
                
            }
            System.out.println();
            

            for (int[] arr : score3) {
                for (int num : arr) {
                    System.out.print(num+"\t");
                }
                System.out.println();
            }
           
        }


    }
    

