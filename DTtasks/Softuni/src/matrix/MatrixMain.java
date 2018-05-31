package matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class MatrixMain {
    private  static int [][] fillCol(int size){
        int [][] matrix = new int[size][size];
        int counter = 1 ;



        return matrix;
    }
    private static int [][]  fillRow(int size){
        int [][] matrix = new int[size][size];
        int counter = 1 ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[j][i]=counter;
                counter++;
            }

        }

        return matrix;
    }
    public static void main(String[] args) {

        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String > stack = new ArrayDeque<>();


        int n = 5;
        int [][] matrix = fillRow(n);
         printMatrix(n);

    }

    private static void printMatrix(int size) {
        int[][] matrix = new int[size][size] ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
