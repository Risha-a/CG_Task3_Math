package Test;

import Math.Matrix.Matrix3x3;
import Math.Vector.Vector3;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestMatrix3x3 {
    @Test
    public void testPlus() {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        Matrix3x3 m1 = new Matrix3x3(data1);
        Matrix3x3 m2 = new Matrix3x3(data2);

        Matrix3x3 result = m1.plus(m2);

        double[][] expectedData = {
                {10, 10, 10},
                {10, 10, 10},
                {10, 10, 10}
        };
        Matrix3x3 expected = new Matrix3x3(expectedData);
        for (int i = 0; i < 3; i++){
            for (int j = 0; i < 3; i++) {
                assertEquals(expected.getElements()[i][j], result.getElements()[i][j], 0.001);
            }
        }
    }

    @Test
    public void testMinus() {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        Matrix3x3 m1 = new Matrix3x3(data1);
        Matrix3x3 m2 = new Matrix3x3(data2);

        Matrix3x3 result = m1.minus(m2);

        double[][] expectedData = {
                {-8, -6, -4},
                {-2, 0, 2},
                {4, 6, 8}
        };
        Matrix3x3 expected = new Matrix3x3(expectedData);

        for (int i = 0; i < 3; i++){
            for (int j = 0; i < 3; i++) {
                assertEquals(expected.getElements()[i][j], result.getElements()[i][j], 0.001);
            }
        }
    }

    @Test
    public void testMultiplyByVector() {
        double[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matrix3x3 matrix = new Matrix3x3(data);
        Vector3 vector = new Vector3(2, 3, 4);
        Vector3 result = matrix.multiplyByVector(vector);
        Vector3 expected = new Vector3(20, 47, 74);
        for (int i = 0; i < 3; i++){
            assertEquals(expected.getX(), result.getX(), 0.001);
            assertEquals(expected.getY(), result.getY(), 0.001);
            assertEquals(expected.getZ(), result.getZ(), 0.001);
        }
    }

    @Test
    public void testMultiply() {
        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        Matrix3x3 m1 = new Matrix3x3(data1);
        Matrix3x3 m2 = new Matrix3x3(data2);
        Matrix3x3 result = m1.multiply(m2);
        double[][] expectedData = {
                {30, 24, 18},
                {84, 69, 54},
                {138, 114, 90}
        };
        Matrix3x3 expected = new Matrix3x3(expectedData);
        for (int i = 0; i < 3; i++){
            for (int j = 0; i < 3; i++) {
                assertEquals(expected.getElements()[i][j], result.getElements()[i][j], 0.001);
            }
        }
    }

    @Test
    public void testTranspose() {
        double[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matrix3x3 matrix = new Matrix3x3(data);
        Matrix3x3 result = matrix.transpose();
        double[][] expectedData = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        Matrix3x3 expected = new Matrix3x3(expectedData);
        for (int i = 0; i < 3; i++){
            for (int j = 0; i < 3; i++) {
                assertEquals(expected.getElements()[i][j], result.getElements()[i][j], 0.001);
            }
        }
    }

    @Test
    public void testIdentity() {
        Matrix3x3 identity = Matrix3x3.identity();
        double[][] expectedData = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        double[][] actualData = identity.getElements();
        assertArrayEquals(expectedData, actualData);
    }

    @Test
    public void testZeroMatrix() {
        Matrix3x3 zero = Matrix3x3.zeroMatrix();
        double[][] expectedData = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        double[][] actualData = zero.getElements();
        assertArrayEquals(expectedData, actualData);
    }

    @Test
    public void testDeterminant(){
        double[][] data = {
                {1, 2, 4},
                {4, 15, 6},
                {2, 8, 9}
        };
        Matrix3x3 matrix = new Matrix3x3(data);
        double result = matrix.determinant();
        assertEquals(47.0, result, 0.001);
    }
}
