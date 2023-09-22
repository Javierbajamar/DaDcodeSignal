package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AdjacentTest {

    private AdjacentElementsProduct adjacent;

    @Before
    public void setUp() {
        adjacent = new AdjacentElementsProduct();
    }

    @Test
    public void test() {

        // Prueba con una lista de números.
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        assertEquals(21, adjacent.solution(inputArray));
    }


    @Test
    public void test2() {

        // Prueba con una lista de números.
        int[] inputArray = {-1, -2};
        assertEquals(2, adjacent.solution(inputArray));
    }

    @Test
    public void test3() {

        // Prueba con una lista de números.
        int[] inputArray = {5, 1, 2, 3, 1, 4};
        assertEquals(6, adjacent.solution(inputArray));
    }

    @Test
    public void test4() {

        // Prueba con una lista de números.
        int[] inputArray = {1, 2, 3, 0};
        assertEquals(6, adjacent.solution(inputArray));
    }

    @Test
    public void test5() {

        // Prueba con una lista de números.
        int[] inputArray = {9, 5, 10, 2, 24, -1, -48};
        assertEquals(50, adjacent.solution(inputArray));
    }

    @Test
    public void test6() {

        // Prueba con una lista de números.
        int[] inputArray = {5, 6, -4, 2, 3, 2, -23};
        assertEquals(30, adjacent.solution(inputArray));
    }

    @Test
    public void test7() {

        // Prueba con una lista de números.
        int[] inputArray = {4, 1, 2, 3, 1, 5};
        assertEquals(6, adjacent.solution(inputArray));
    }

    @Test
    public void test8() {

        // Prueba con una lista de números.
        int[] inputArray = {-23, 4, -3, 8, -12};
        assertEquals(-12, adjacent.solution(inputArray));
    }

    @Test
    public void test9() {

        // Prueba con una lista de números.
        int[] inputArray = {1, 0, 1, 0, 1000};
        assertEquals(0, adjacent.solution(inputArray));
    }


}

