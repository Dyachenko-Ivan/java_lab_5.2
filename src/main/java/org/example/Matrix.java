package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMAtrix {

    private int N;
    private double[] arr;
    private double det;
    private boolean detFlag = false;

    public Matrix(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("Некорректное занчене N");
        }
        this.N = N;
        this.arr = new double[N * N];
    }


    @Override
    public double getIndex(int y, int x) { //Ayx
        if (x > N || x <= 0 || y > N || y <= 0) {
            throw new IllegalArgumentException("Некорректные занчения x,y");
        }
        return arr[(y - 1) * N + x - 1]; //1111222233334444
    }

    @Override
    public void setIndex(int y, int x, double value) { //Ayx
        if (x > N || x <= 0 || y > N || y <= 0) {
            throw new IllegalArgumentException("Некорректные занчения x,y");
        }
        this.arr[(y - 1) * N + x - 1] = value;

        detFlag = false;
    }


    @Override
    public double calculateDet() {
        if (detFlag) {
            //System.out.println("+");
            return det;
        } else {
            //System.out.println("-");
            double[] newArr = new double[N * N];
            for (int i = 0; i < N * N; i++) {
                newArr[i] = arr[i];
            }

            for (int i = 0; i < N - 1; i++) {//i - x
                double deduct = newArr[N * i + i];
                if (deduct == 0) {
                    return 0;
                }
                for (int j = 1 + i; j < N; j++) {//j - y
                    double el = newArr[j * N + i] / deduct;// [5]/[5] --->  el=[9]/[5]=2;
                    for (int k = 0; k < N; k++) {
                        newArr[j * N + k] -= newArr[i * N + k] * el; //может быть j*n+I+k   //[4]- [4]*-4  -->
                        //printMatrix();

                    }
                }
            }
            double tmp_det = 1;
            for (int i = 0; i < N; i++) {
                tmp_det *= newArr[N * i + i];
            }

            det = tmp_det;
            detFlag = true;
            return det;
        }
    }


    public int getN() {
        return N;
    }

    public void printMatrix() { //Ayx
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(getIndex(i, j) + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return N == matrix.N && Objects.deepEquals(arr, matrix.arr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(N, Arrays.hashCode(arr));
    }
}
