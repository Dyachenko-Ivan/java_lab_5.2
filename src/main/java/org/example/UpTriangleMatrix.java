package org.example;

public class UpTriangleMatrix extends Matrix {

    public UpTriangleMatrix(int N) {
        super(N);
    }


    @Override
    public void setIndex(int y, int x, double value) { //Ayx
        if (y>x && value!=0){
            throw new IllegalArgumentException("Попытка записать ненулевое значение ниже диагонали");
        }
        super.setIndex(y,x,value);
    }
}
