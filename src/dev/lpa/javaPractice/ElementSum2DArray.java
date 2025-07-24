package dev.lpa.javaPractice;

public class ElementSum2DArray {
    public static void main(String[] args) {
        int sum = sumElements(new int[][]{{2,3},{6,7},{4,8}});
    System.out.println(sum);
    }

    public static int sumElements(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
