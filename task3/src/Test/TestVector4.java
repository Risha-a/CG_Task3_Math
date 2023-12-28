package Test;
import Math.Vector.Vector4;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class TestVector4 {

    @Test
    public void testPlus() {
        Vector4 v1 = new Vector4(3 , 4 , 5 , 4 );
        Vector4 v2 = new Vector4(1 , 2 , 3 , 4 );
        Vector4 result = v1.plus(v2);
        assertEquals(4 , result.getX());
        assertEquals(6 , result.getY());
        assertEquals(8 , result.getZ());
        assertEquals(8 , result.getW());
    }

    @Test
    public void testMinus() {
        Vector4 v1 = new Vector4(3 , 4 , 5 , 4 );
        Vector4 v2 = new Vector4(1 , 2 , 3 , 4 );
        Vector4 result = v1.minus(v2);
        assertEquals(2 , result.getX());
        assertEquals(2 , result.getY());
        assertEquals(2 , result.getZ());
        assertEquals(0 , result.getW());
    }

    @Test
    public void testMultiply() {
        Vector4 vector = new Vector4(3 , 4 , 5 , 4 );
        Vector4 result = vector.multiply(2 );
        assertEquals(6 , result.getX());
        assertEquals(8 , result.getY());
        assertEquals(10 , result.getZ());
        assertEquals(8 , result.getW());
    }

    @Test
    public void testDivide() {
        Vector4 vector = new Vector4(6 , 8 , 10 , 8 );
        Vector4 result = vector.divide(2 );
        assertEquals(3 , result.getX());
        assertEquals(4 , result.getY());
        assertEquals(5 , result.getZ());
        assertEquals(4 , result.getW());
    }

    @Test
    public void testLength() {
        Vector4 vector = new Vector4(2 , 3 , 4 , 5 );
        double length = vector.length();
        assertEquals(7.3, length, 0.1);
    }

    @Test
    public void testNormalize() {
        Vector4 vector = new Vector4(3 , 4 , 5 , 4 );
        Vector4 result = vector.normalize();
        assertEquals(0.37, result.getX(), 0.1);
        assertEquals(0.49, result.getY(), 0.1);
        assertEquals(0.62, result.getZ(), 0.1);
        assertEquals(0.49, result.getW(), 0.1);
    }

    @Test
    public void testDotProduct() {
        Vector4 v1 = new Vector4(4 , 5 , 6 , 4 );
        Vector4 v2 = new Vector4(1 , 2 , 3 , 4 );
        double dotProduct = v1.dotProduct(v2);
        assertEquals(48 , dotProduct);
    }
}
