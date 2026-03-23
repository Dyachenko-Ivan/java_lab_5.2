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

        assertEquals(0.0, m.calculateDet());
    }
    @Test
    public void test_2(){
        DiagMatrix md1 = new DiagMatrix(3);
        md1.setIndex(1,1, 1);
        md1.setIndex(2,2, 5);
        md1.setIndex(3,3, 9);
        //md1.setIndex(1,2, 2);

        double[] arrmd = new double[3];
        arrmd[0]=1;
        arrmd[1]=5;
        arrmd[2]=9;

        DiagMatrix md2 = new DiagMatrix(arrmd);

        assertEquals(md1.calculateDet(), md2.calculateDet());
    }

    @Test
    public void test_3(){
        UpTriangleMatrix mt1 = new UpTriangleMatrix(3);
        mt1.setIndex(1,1,1);
        mt1.setIndex(2,2,5);
        mt1.setIndex(3,3,9);
        //mt1.setIndex(2,1,4);

        DiagMatrix md1 = new DiagMatrix(3);
        md1.setIndex(1,1, 1);
        md1.setIndex(2,2, 5);
        md1.setIndex(3,3, 9);

        assertEquals(mt1.calculateDet(), md1.calculateDet());
    }
    @Test
    public void test_4(){
        Matrix m1 = new Matrix(2);
        m1.setIndex(1,1,1);
        m1.setIndex(1,2,2);
        m1.setIndex(2,1,3);
        m1.setIndex(2,2,4);

        Matrix m2 = new Matrix(2);
        m2.setIndex(1,1,0);
        m2.setIndex(1,2,0);
        m2.setIndex(2,1,0);
        m2.setIndex(2,2,0);

        Matrix m3 = new Matrix(3);
        m3.setIndex(1,1,1);
        m3.setIndex(1,2,2);
        m3.setIndex(1,3,3);
        m3.setIndex(2,1,4);
        m3.setIndex(2,2,5);
        m3.setIndex(2,3,6);
        m3.setIndex(3,1,7);
        m3.setIndex(3,2,8);
        m3.setIndex(3,3,10);

        Matrix m4 = new UpTriangleMatrix(2);
        m4.setIndex(1,1,2);
        m4.setIndex(1,2,1);
        m4.setIndex(2,2,2);

        Matrix m5 = new DiagMatrix(2);
        m5.setIndex(1,1,1);
        m5.setIndex(2,2,1);

        Matrix[] arrMatrix = new Matrix[5];
        arrMatrix[0]=m1;
        arrMatrix[1]=m2;
        arrMatrix[2]=m3;
        arrMatrix[3]=m4;
        arrMatrix[4]=m5;

        MatrixService.arrangeMatrices(arrMatrix);

        Matrix[] arrTrue = new Matrix[5];
        arrTrue[0]=m3; //-3
        arrTrue[1]=m1; //-2
        arrTrue[2]=m2; //0
        arrTrue[3]=m5; //1
        arrTrue[4]=m4; //4

        assertArrayEquals(arrMatrix, arrTrue);
    }
}
