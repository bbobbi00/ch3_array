package array;

public class ArrayEx13 {
    public static void main(String[] args) {
        //2차원 배열
        int[][] intArr = new int[][]{{1,2,3},{4,5,6}};
        int[][] intArr1 = {{1,2,3},{4,5,6}};

        int sum=0;
        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr1[i].length; j++) {
                System.out.print(intArr1[i][j]+"\t");
                sum += intArr[i][j];
            }
            System.out.println();
        }
        System.out.println("배열 합: "+sum);
    }
    
}
