package Math.Matrix;

import Math.Vector.Vector3;

public class Matrix3x3 {
    private double[][] elements;

    public Matrix3x3(double[][] elements) {
        if (elements.length != 3 || elements[0].length != 3 || elements[1].length != 3 || elements[2].length != 3) {
            throw new IllegalArgumentException("Я же просто прошу матрицу 3x3");
        }
        this.elements = elements;
    }

    public double[][] getElements() {
        return elements;
    }

    public Matrix3x3 plus(Matrix3x3 other) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return new Matrix3x3(result);
    }

    public Matrix3x3 minus(Matrix3x3 other) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = this.elements[i][j] - other.elements[i][j];
            }
        }
        return new Matrix3x3(result);
    }

    public Matrix3x3 multiply(Matrix3x3 other) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return new Matrix3x3(result);
    }
    public Vector3 multiplyByVector(Vector3 vector) {
        double resultX = elements[0][0] * vector.getX() + elements[0][1] * vector.getY() + elements[0][2] * vector.getZ();
        double resultY = elements[1][0] * vector.getX() + elements[1][1] * vector.getY() + elements[1][2] * vector.getZ();
        double resultZ = elements[2][0] * vector.getX() + elements[2][1] * vector.getY() + elements[2][2] * vector.getZ();

        return new Vector3(resultX, resultY, resultZ);
    }

    public Matrix3x3 transpose() {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = this.elements[j][i];
            }
        }
        return new Matrix3x3(result);
    }

    public static Matrix3x3 identity() {
        double[][] identityMatrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        return new Matrix3x3(identityMatrix);
    }

    public static Matrix3x3 zeroMatrix() {
        double[][] zeroMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        return new Matrix3x3(zeroMatrix);
    }

    public double determinant() {
        return elements[0][0] * (elements[1][1] * elements[2][2] - elements[1][2] * elements[2][1])
                - elements[0][1] * (elements[1][0] * elements[2][2] - elements[1][2] * elements[2][0])
                + elements[0][2] * (elements[1][0] * elements[2][1] - elements[1][1] * elements[2][0]);
    }
}
