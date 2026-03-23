package org.example;

public class DiagMatrix extends Matrix {
    public DiagMatrix(int N) {
        super(N);
    }

    public DiagMatrix(double[] tmp_arr) {
        super(tmp_arr.length);
        for (int i = 1; i < tmp_arr.length+1; i++) {
            setIndex(i,i,tmp_arr[i-1]);
        }
    }

    @Override
    public void setIndex(int y, int x, double value) {
        if (x!=y && value!=0){
            throw new IllegalArgumentException("Попытка записать ненулевой элемент вне диогонали");
        }
        super.setIndex(y,x,value);
    }

}