/*
Rastgele oluşturulmuş iki adet 5x5 matrisin çarpımını, çoklu thread kullanarak yapan bir Java programı yazınız.
Her thread, sonuç matrisinin bir elemanını hesaplamalıdır.
 */

import java.util.Random;

class MatrixThread extends Thread {
    int row, col;
    int[][] A, B, C;

    MatrixThread(int row, int col, int[][] A, int[][] B, int[][] C) {
        this.row = row;
        this.col = col;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void run() {
        for (int k = 0; k < 5; k++) {
            C[row][col] += A[row][k] * B[k][col];
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) throws InterruptedException {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] C = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                A[i][j] = rand.nextInt(10);
                B[i][j] = rand.nextInt(10);
            }

        MatrixThread[][] threads = new MatrixThread[5][5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                threads[i][j] = new MatrixThread(i, j, A, B, C);
                threads[i][j].start();
            }

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                threads[i][j].join();

        System.out.println("Sonuç Matrisi:");
        for (int[] row : C) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
