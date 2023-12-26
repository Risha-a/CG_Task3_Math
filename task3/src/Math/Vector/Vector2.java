package Math.Vector;

public class Vector2 {
    private double x, y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2 plus(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public Vector2 minus(Vector2 other) {
        return new Vector2(this.x - other.x, this.y - other.y);
    }

    public Vector2 multiply(double scalar) {
        return new Vector2(this.x * scalar, this.y * scalar);
    }

    public Vector2 divide(double scalar) {
        if (scalar == 0) {
            throw new IllegalArgumentException("Мы не делим на 0");
        }
        return new Vector2(this.x / scalar, this.y / scalar);
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2 normalize() {
        double length = length();
        if (length == 0) {
            throw new ArithmeticException("Ты точно хочешь нормализовать 0-вектор?");
        }
        return this.divide(length);
    }

    public double dotProduct(Vector2 other) {
        return this.x * other.x + this.y * other.y;
    }
}
