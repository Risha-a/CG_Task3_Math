package Math.Vector;

public class Vector4 {
    private double x, y, z, w;

    public Vector4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
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

    public double getW() {
        return w;
    }

    public Vector4 plus(Vector4 other) {
        return new Vector4(this.x + other.x, this.y + other.y, this.z + other.z, this.w + other.w);
    }

    public Vector4 minus(Vector4 other) {
        return new Vector4(this.x - other.x, this.y - other.y, this.z - other.z, this.w - other.w);
    }

    public Vector4 multiply(double scalar) {
        return new Vector4(this.x * scalar, this.y * scalar, this.z * scalar, this.w * scalar);
    }

    public Vector4 divide(double scalar) {
        if (scalar == 0) {
            throw new IllegalArgumentException("Мы не делим на 0");
        }
        return new Vector4(this.x / scalar, this.y / scalar, this.z / scalar, this.w / scalar);
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public Vector4 normalize() {
        double length = length();
        if (length == 0) {
            throw new ArithmeticException("Ты точно хочешь нормализовать 0-вектор?");
        }
        return this.divide(length);
    }

    public double dotProduct(Vector4 other) {
        return this.x * other.x + this.y * other.y + this.z * other.z + this.w * other.w;
    }
}
