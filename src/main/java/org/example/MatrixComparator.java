package org.example;

import java.util.Comparator;
public class MatrixComparator implements Comparator<Matrix>{

    public int compare(Matrix a, Matrix b){
        double detA=a.calculateDet();
        double detB=b.calculateDet();
        if (detA>detB){
            return 1;
        }else if (detB> detA){
            return -1;
        }else{
            return 0;
        }
    }
}