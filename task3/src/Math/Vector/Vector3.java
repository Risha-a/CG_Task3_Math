package Math.Vector;

public class Vector3 {
    private double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3 plus(Vector3 other) {
        return new Vector3(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3 minus(Vector3 other) {
        return new Vector3(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector3 multiply(double scalar) {
        return new Vector3(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public Vector3 divide(double scalar) {
        if (scalar == 0) {
            throw new IllegalArgumentException("Мы не делим на 0");
        }
        return new Vector3(this.x / scalar, this.y / scalar, this.z / scalar);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3 normalize() {
        double length = length();
        if (length == 0) {
            throw new ArithmeticException("Ты точно хочешь нормализовать 0-вектор?");
        }
        return this.divide(length);
    }

    public double dotProduct(Vector3 other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3 crossProduct(Vector3 other) {
        double resultX = this.y * other.z - this.z * other.y;
        double resultY = this.z * other.x - this.x * other.z;
        double resultZ = this.x * other.y - this.y * other.x;
        return new Vector3(resultX, resultY, resultZ);
    }
}
