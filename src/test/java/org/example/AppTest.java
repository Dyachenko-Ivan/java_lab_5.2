package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest {
    @Test
    public void test_1_1(){
        Matrix m = new Matrix(2);

        m.setIndex(1,1, 1);
        m.setIndex(1,2, 2);
        m.setIndex(2,1, 3);
        m.setIndex(2,2, 4);

        assertEquals(-2.0, m.calculateDet());
    }
    @Test
    public void test_1_2(){
        Matrix m = new Matrix(3);

        m.setIndex(1,1, 1);
        m.setIndex(1,2, 2);
        m.setIndex(1,3, 3);
        m.setIndex(2,1, 2);
        m.setIndex(2,2, 4);
        m.setIndex(2,3, 6);
        m.setIndex(3,1, 7);
        m.setIndex(3,2, 8);
        m.setIndex(3,3, 9);



        m.printMatrix();

        System.out.println(m.calculateDet());
    }
    @Test
    public void test_2(){
        DiagMatrix md1 = new DiagMatrix(2);
        md1.setIndex(1,1, 1);
        //md1.setIndex(1,2, 2);
        //md1.setIndex(2,1, 3);
        md1.setIndex(2,2, 4);

        md1.printMatrix();
        System.out.println(md1.calculateDet());

        double[] arrmd = new double[4];
        arrmd[0]=1;
        arrmd[1]=2;
        arrmd[2]=3;
        arrmd[3]=4;

        DiagMatrix md2 = new DiagMatrix(arrmd);

        md2.printMatrix();
        System.out.println(md2.calculateDet());
    }

    @Test
    public void test_3(){
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

        //для проверки флага:
        //System.out.println(mt1.calculateDet());

        //mt1.setIndex(1,1,8);

        //mt1.printMatrix();
        //System.out.println(mt1.calculateDet());
    }
    @Test
    public void test_4(){
        Matrix m1 = new Matrix(2);
        m1.setIndex(1,1,1);
        m1.setIndex(1,2,2);
        m1.setIndex(2,1,3);
        m1.setIndex(2,2,4);
        System.out.println(m1.calculateDet());

        Matrix m2 = new Matrix(2);
        m2.setIndex(1,1,4);
        m2.setIndex(1,2,3);
        m2.setIndex(2,1,1);
        m2.setIndex(2,2,2);
        System.out.println(m2.calculateDet());

        Matrix m3 = new Matrix(2);
        m3.setIndex(1,1,0);
        m3.setIndex(1,2,0);
        m3.setIndex(2,1,0);
        m3.setIndex(2,2,0);
        System.out.println(m3.calculateDet());

        Matrix m4 = new DiagMatrix(2);
        m4.setIndex(1,1,2);
        m4.setIndex(2,2,1);
        System.out.println(m4.calculateDet());

        Matrix m5 = new UpTriangleMatrix(2);
        m5.setIndex(1,1,2);
        m5.setIndex(1,2,1);
        m5.setIndex(2,2,1);
        System.out.println(m5.calculateDet());



        Matrix[] arrMatrix = new Matrix[5];
        arrMatrix[0]=m1;
        arrMatrix[1]=m2;
        arrMatrix[2]=m3;
        arrMatrix[3]=m4;
        arrMatrix[4]=m5;

        System.out.println();

        MatrixService.arrangeMatrices(arrMatrix);

        System.out.println(arrMatrix[0].calculateDet());
        System.out.println(arrMatrix[1].calculateDet());
        System.out.println(arrMatrix[2].calculateDet());
        System.out.println(arrMatrix[3].calculateDet());
        System.out.println(arrMatrix[4].calculateDet());

//        assertArrayEquals();
    }
}
