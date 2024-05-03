
import org.example.Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test public void testSetAndGet() {
        Matrix matrix = new Matrix(3);
        matrix.set(0, 0, 1);
        matrix.set(1, 1, 2);
        matrix.set(2, 2, 3);
        assertEquals(1, matrix.get(0, 0));
        assertEquals(2, matrix.get(1, 1));
        assertEquals(3, matrix.get(2, 2));
    }
    @Test void testSetAndGetError(){
        Matrix matrix = new Matrix(3);

        //test negative !!
        assertThrows(IllegalArgumentException.class , ()-> matrix.set(-1, -1, 1));
        assertThrows(IllegalArgumentException.class , ()-> matrix.get(-1, -1));

        //test out of bound !!
        assertThrows(IllegalArgumentException.class , ()-> matrix.set(3, 3, 1));
        assertThrows(IllegalArgumentException.class , ()-> matrix.get(3, 3));
    }

    @Test public void testAdd() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.add(matrix2);

        assertEquals(6, matrix1.get(0, 0));
        assertEquals(8, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(12, matrix1.get(1, 1));
    }
    @Test public void testAddNull(){
        Matrix matrix = new Matrix(2);
        assertThrows(NullPointerException.class , ()->matrix.add(null));
    }
    @Test public void testAddDifferentMatrixSize(){
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(3);
        assertThrows(IllegalArgumentException.class , ()->matrix1.add(matrix2));
    }

    @Test public void testMultiply() {
        Matrix matrix1 = new Matrix(2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix matrix2 = new Matrix(2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        matrix1.multiply(matrix2);

        assertEquals(19, matrix1.get(0, 0));
        assertEquals(22, matrix1.get(0, 1));
        assertEquals(43, matrix1.get(1, 0));
        assertEquals(50, matrix1.get(1, 1));
    }
    @Test public void testMultiplyNull(){
        Matrix matrix = new Matrix(2);
        assertThrows(NullPointerException.class , ()->matrix.multiply(null));
    }
    @Test public void testMultiplyDifferentMatrixSize(){
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(3);
        assertThrows(IllegalArgumentException.class , ()->matrix1.multiply(matrix2));
    }

    @Test public void testTranspose() {
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        matrix.transpose();

        assertEquals(1, matrix.get(0, 0));
        assertEquals(3, matrix.get(0, 1));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(4, matrix.get(1, 1));
    }

    @Test public void testToString(){
        Matrix matrix = new Matrix(2);
        assertEquals(matrix.toString() , "[0, 0]\n[0, 0]\n");
    }
}

