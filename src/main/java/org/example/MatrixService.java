package org.example;

import java.util.Arrays;

public class MatrixService {
    public static void arrangeMatrices(Matrix[] arr){
        Arrays.sort(arr, new MatrixComparator());
    }
}
