package Test;
import Math.Vector.Vector4;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class TestVector4 {

    @Test
    public void testPlus() {
        Vector4 v1 = new Vector4(3.0, 4.0, 5.0, 4.0);
        Vector4 v2 = new Vector4(1.0, 2.0, 3.0, 4.0);
        Vector4 result = v1.plus(v2);
        assertEquals(4.0, result.getX());
        assertEquals(6.0, result.getY());
        assertEquals(8.0, result.getZ());
        assertEquals(8.0, result.getW());
    }

    @Test
    public void testMinus() {
        Vector4 v1 = new Vector4(3.0, 4.0, 5.0, 4.0);
        Vector4 v2 = new Vector4(1.0, 2.0, 3.0, 4.0);
        Vector4 result = v1.minus(v2);
        assertEquals(2.0, result.getX());
        assertEquals(2.0, result.getY());
        assertEquals(2.0, result.getZ());
        assertEquals(0.0, result.getW());
    }

    @Test
    public void testMultiply() {
        Vector4 vector = new Vector4(3.0, 4.0, 5.0, 4.0);
        Vector4 result = vector.multiply(2.0);
        assertEquals(6.0, result.getX());
        assertEquals(8.0, result.getY());
        assertEquals(10.0, result.getZ());
        assertEquals(8.0, result.getW());
    }

    @Test
    public void testDivide() {
        Vector4 vector = new Vector4(6.0, 8.0, 10.0, 8.0);
        Vector4 result = vector.divide(2.0);
        assertEquals(3.0, result.getX());
        assertEquals(4.0, result.getY());
        assertEquals(5.0, result.getZ());
        assertEquals(4.0, result.getW());
    }

    @Test
    public void testLength() {
        Vector4 vector = new Vector4(2.0, 3.0, 4.0, 5.0);
        double length = vector.length();
        assertEquals(7.3, length, 0.1);
    }

    @Test
    public void testNormalize() {
        Vector4 vector = new Vector4(3.0, 4.0, 5.0, 4.0);
        Vector4 result = vector.normalize();
        assertEquals(0.37, result.getX(), 0.01);
        assertEquals(0.49, result.getY(), 0.01);
        assertEquals(0.62, result.getZ(), 0.01);
        assertEquals(0.49, result.getW(), 0.01);
    }

    @Test
    public void testDotProduct() {
        Vector4 v1 = new Vector4(4.0, 5.0, 6.0, 4.0);
        Vector4 v2 = new Vector4(1.0, 2.0, 3.0, 4.0);
        double dotProduct = v1.dotProduct(v2);
        assertEquals(48.0, dotProduct);
    }
}
