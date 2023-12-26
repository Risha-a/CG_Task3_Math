package Test;
import Math.Vector.Vector3;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class TestVector3 {

    @Test
    public void testPlus() {
        Vector3 v1 = new Vector3(3.0, 4.0, 5.0);
        Vector3 v2 = new Vector3(1.0, 2.0, 3.0);
        Vector3 result = v1.plus(v2);
        assertEquals(4.0, result.getX());
        assertEquals(6.0, result.getY());
        assertEquals(8.0, result.getZ());
    }

    @Test
    public void testMinus() {
        Vector3 v1 = new Vector3(3.0, 4.0, 5.0);
        Vector3 v2 = new Vector3(1.0, 2.0, 3.0);
        Vector3 result = v1.minus(v2);
        assertEquals(2.0, result.getX());
        assertEquals(2.0, result.getY());
        assertEquals(2.0, result.getZ());
    }

    @Test
    public void testMultiply() {
        Vector3 vector = new Vector3(3.0, 4.0, 5.0);
        Vector3 result = vector.multiply(2.0);
        assertEquals(6.0, result.getX());
        assertEquals(8.0, result.getY());
        assertEquals(10.0, result.getZ());
    }

    @Test
    public void testDivide() {
        Vector3 vector = new Vector3(6.0, 8.0, 10.0);
        Vector3 result = vector.divide(2.0);
        assertEquals(3.0, result.getX());
        assertEquals(4.0, result.getY());
        assertEquals(5.0, result.getZ());
    }

    @Test
    public void testLength() {
        Vector3 vector = new Vector3(2.0, 3.0, 4.0);
        double length = vector.length();
        assertEquals(5.4, length, 0.1);
    }

    @Test
    public void testNormalize() {
        Vector3 vector = new Vector3(3.0, 4.0, 5.0);
        Vector3 result = vector.normalize();
        assertEquals(0.42, result.getX(), 0.01);
        assertEquals(0.56, result.getY(), 0.01);
        assertEquals(0.7, result.getZ(), 0.01);
    }

    @Test
    public void testDotProduct() {
        Vector3 v1 = new Vector3(4.0, 5.0, 6.0);
        Vector3 v2 = new Vector3(1.0, 2.0, 3.0);
        double dotProduct = v1.dotProduct(v2);
        assertEquals(32.0, dotProduct);
    }
    @Test
    public void testCrossProduct(){
        Vector3 v1 = new Vector3(4.0, 5.0, 6.0);
        Vector3 v2 = new Vector3(1.0, 2.0, 3.0);
        Vector3 result = v1.crossProduct(v2);
        assertEquals(3.0, result.getX());
        assertEquals(-6.0, result.getY());
        assertEquals(3.0, result.getZ());
    }
}