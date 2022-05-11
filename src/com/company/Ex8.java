package com.company;

public class Ex8 {
    public static void main(String[] args){

        int[][] matrixA = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixB = new int[][]{{10,11,12},{13,14,15},{16,17,18}};

        for(int i=0; i<3; i++){
            int result1 = matrixA[i][0] * matrixB[0][0] + matrixA[i][1] * matrixB[1][0] + matrixA[i][2]*matrixB[2][0];
            int result2 = matrixA[i][0] * matrixB[0][1] + matrixA[i][1] * matrixB[1][1] + matrixA[i][2]*matrixB[2][1];
            int result3 = matrixA[i][0] * matrixB[0][2] + matrixA[i][1] * matrixB[1][2] + matrixA[i][2]*matrixB[2][2];
            System.out.print(result1 + "\t");
            System.out.print(result2 + "\t");
            System.out.print(result3 + "\n");
        }
    }

}
