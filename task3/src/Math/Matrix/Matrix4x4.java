package Math.Matrix;

import Math.Vector.Vector4;

public class Matrix4x4 {
    private double[][] elements;

    public Matrix4x4(double[][] elements) {
        if (elements.length != 4 || elements[0].length != 4 || elements[1].length != 4 || elements[2].length != 4 || elements[3].length != 4) {
            throw new IllegalArgumentException("Тебе сложно написать матрицу 4x4?");
        }
        this.elements = elements;
    }

    public double[][] getElements() {
        return elements;
    }

    public Matrix4x4 plus(Matrix4x4 other) {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return new Matrix4x4(result);
    }

    public Matrix4x4 minus(Matrix4x4 other) {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = this.elements[i][j] - other.elements[i][j];
            }
        }
        return new Matrix4x4(result);
    }

    public Matrix4x4 multiply(Matrix4x4 other) {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    result[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return new Matrix4x4(result);
    }
    public Vector4 multiplyByVector(Vector4 vector) {
        double resultX = elements[0][0] * vector.getX() + elements[0][1] * vector.getY() + elements[0][2] * vector.getZ() + elements[0][3] * vector.getW();
        double resultY = elements[1][0] * vector.getX() + elements[1][1] * vector.getY() + elements[1][2] * vector.getZ() + elements[1][3] * vector.getW();
        double resultZ = elements[2][0] * vector.getX() + elements[2][1] * vector.getY() + elements[2][2] * vector.getZ() + elements[2][3] * vector.getW();
        double resultW = elements[3][0] * vector.getX() + elements[3][1] * vector.getY() + elements[3][2] * vector.getZ() + elements[3][3] * vector.getW();
        return new Vector4(resultX, resultY, resultZ, resultW);
    }

    public Matrix4x4 transpose() {
        double[][] result = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = this.elements[j][i];
            }
        }
        return new Matrix4x4(result);
    }

    public static Matrix4x4 identity() {
        double[][] identityMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        return new Matrix4x4(identityMatrix);
    }

    public static Matrix4x4 zeroMatrix() {
        double[][] zeroMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        return new Matrix4x4(zeroMatrix);
    }
    public double determinant() {
        return elements[0][0] * (elements[1][1] * (elements[2][2] * elements[3][3] - elements[2][3] * elements[3][2])
                - elements[1][2] * (elements[2][1] * elements[3][3] - elements[2][3] * elements[3][1])
                + elements[1][3] * (elements[2][1] * elements[3][2] - elements[2][2] * elements[3][1]))
                - elements[0][1] * (elements[1][0] * (elements[2][2] * elements[3][3] - elements[2][3] * elements[3][2])
                - elements[1][2] * (elements[2][0] * elements[3][3] - elements[2][3] * elements[3][0])
                + elements[1][3] * (elements[2][0] * elements[3][2] - elements[2][2] * elements[3][0]))
                + elements[0][2] * (elements[1][0] * (elements[2][1] * elements[3][3] - elements[2][3] * elements[3][1])
                - elements[1][1] * (elements[2][0] * elements[3][3] - elements[2][3] * elements[3][0])
                + elements[1][3] * (elements[2][0] * elements[3][1] - elements[2][1] * elements[3][0]))
                - elements[0][3] * (elements[1][0] * (elements[2][1] * elements[3][2] - elements[2][2] * elements[3][1])
                - elements[1][1] * (elements[2][0] * elements[3][2] - elements[2][2] * elements[3][0])
                + elements[1][2] * (elements[2][0] * elements[3][1] - elements[2][1] * elements[3][0]));
    }
}
