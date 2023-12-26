package Test;

import Math.Vector.Vector2;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class TestVector2 {

    @Test
    public void testPlus() {
        Vector2 v1 = new Vector2(3, 4);
        Vector2 v2 = new Vector2(1, 2);
        Vector2 result = v1.plus(v2);
        assertEquals(4.0, result.getX());
        assertEquals(6.0, result.getY());
    }

    @Test
    public void testMinus() {
        Vector2 v1 = new Vector2(3.0, 4.0);
        Vector2 v2 = new Vector2(1.0, 2.0);
        Vector2 result = v1.minus(v2);
        assertEquals(2.0, result.getX());
        assertEquals(2.0, result.getY());
    }

    @Test
    public void testMultiply() {
        Vector2 vector = new Vector2(3.0, 4.0);
        Vector2 result = vector.multiply(2.0);
        assertEquals(6.0, result.getX());
        assertEquals(8.0, result.getY());
    }

    @Test
    public void testDivide() {
        Vector2 vector = new Vector2(6.0, 8.0);
        Vector2 result = vector.divide(2.0);
        assertEquals(3.0, result.getX());
        assertEquals(4.0, result.getY());
    }

    @Test
    public void testLength() {
        Vector2 vector = new Vector2(3.0, 4.0);
        double length = vector.length();
        assertEquals(5.0, length);
    }

    @Test
    public void testNormalize() {
        Vector2 vector = new Vector2(3.0, 4.0);
        Vector2 result = vector.normalize();
        assertEquals(0.6, result.getX());
        assertEquals(0.8, result.getY());
    }

    @Test
    public void testDotProduct() {
        Vector2 v1 = new Vector2(3.0, 4.0);
        Vector2 v2 = new Vector2(1.0, 2.0);
        double dotProduct = v1.dotProduct(v2);
        assertEquals(11.0, dotProduct);
    }
}