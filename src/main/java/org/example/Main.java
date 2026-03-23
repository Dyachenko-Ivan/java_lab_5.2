package org.example;

public class Main {


    public static void main(String[] args) {

        Matrix m = new Matrix(4);
        int a =1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                m.setIndex(i, j, a);
                a++;
            }
        }

        m.setIndex(1,1,11);
        m.setIndex(2,2,66);
        m.setIndex(4,4,0);
        m.printMatrix();

        System.out.println(m.calculateDet());






        Matrix m2 = new Matrix(2);

        m2.setIndex(1,1, 1);
        m2.setIndex(1,2, 2);
        m2.setIndex(2,1, 3);
        m2.setIndex(2,2, 4);

        m2.printMatrix();

        System.out.println(m2.calculateDet());

        //m2.printMatrix();

        Matrix m3 = new Matrix(3);

        m3.setIndex(1,1, 1);
        m3.setIndex(1,2, 2);
        m3.setIndex(1,3, 3);
        m3.setIndex(2,1, 2);
        m3.setIndex(2,2, 4);
        m3.setIndex(2,3, 6);
        m3.setIndex(3,1, 7);
        m3.setIndex(3,2, 8);
        m3.setIndex(3,3, 9);



        m3.printMatrix();

        System.out.println(m3.calculateDet());





        DiagMatrix md1 = new DiagMatrix(2);
        md1.setIndex(1,1, 1);
        //md1.setIndex(1,2, 2);
        //md1.setIndex(2,1, 3);
        md1.setIndex(2,2, 4);

        md1.printMatrix();
        //System.out.println(md1.calculateDet());

        double[] arrmd = new double[4];
        arrmd[0]=1;
        arrmd[1]=2;
        arrmd[2]=3;
        arrmd[3]=4;

        DiagMatrix md2 = new DiagMatrix(arrmd);

        md2.printMatrix();




        UpTriangleMatrix mt1 = new UpTriangleMatrix(3);
        mt1.setIndex(1,1,1);
        mt1.setIndex(1,2,2);
        mt1.setIndex(1,3,3);
        //mt1.setIndex(2,1,4);
        mt1.setIndex(2,2,5);
        mt1.setIndex(2,3,6);
        //mt1.setIndex(3,1,7);
        //mt1.setIndex(3,2,8);
        mt1.setIndex(3,3,9);

        mt1.printMatrix();

        System.out.println(mt1.calculateDet());

        System.out.println(mt1.calculateDet());

        mt1.setIndex(1,1,8);

        mt1.printMatrix();
        System.out.println(mt1.calculateDet());






        Matrix m4 = new Matrix(2);
        m4.setIndex(1,1,1);
        m4.setIndex(1,2,2);
        m4.setIndex(2,1,3);
        m4.setIndex(2,2,4);
        System.out.println(m4.calculateDet());

        Matrix m5 = new Matrix(2);
        m5.setIndex(1,1,4);
        m5.setIndex(1,2,3);
        m5.setIndex(2,1,1);
        m5.setIndex(2,2,2);
        System.out.println(m5.calculateDet());

        Matrix m6 = new Matrix(2);
        m6.setIndex(1,1,0);
        m6.setIndex(1,2,0);
        m6.setIndex(2,1,0);
        m6.setIndex(2,2,0);
        System.out.println(m6.calculateDet());

        Matrix m7 = new Matrix(2);
        m7.setIndex(1,1,2);
        m7.setIndex(1,2,1);
        m7.setIndex(2,1,1);
        m7.setIndex(2,2,1);
        System.out.println(m7.calculateDet());

        Matrix m8 = new Matrix(2);
        m8.setIndex(1,1,2);
        m8.setIndex(1,2,1);
        m8.setIndex(2,1,1);
        m8.setIndex(2,2,1);
        System.out.println(m8.calculateDet());



        Matrix[] arrMatrix = new Matrix[5];
        arrMatrix[0]=m4;
        arrMatrix[1]=m5;
        arrMatrix[2]=m6;
        arrMatrix[3]=m7;
        arrMatrix[4]=m8;



        MatrixService.arrangeMatrices(arrMatrix);
        
        System.out.println();
        System.out.println(arrMatrix[0].calculateDet());
        System.out.println(arrMatrix[1].calculateDet());
        System.out.println(arrMatrix[2].calculateDet());
        System.out.println(arrMatrix[3].calculateDet());
        System.out.println(arrMatrix[4].calculateDet());
    }
}
