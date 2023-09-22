package dad.codesignal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenturyTest {

    private CenturyFromYear century;

    @Before
    public void setUp() {
        century = new CenturyFromYear();
    }

    @Test
    public void test1() {
        assertEquals(20, century.solution(1905));

    }

    @Test
    public void test2() {
        assertEquals(17, century.solution(1700));

    }

    @Test
    public void test3() {
        assertEquals(20, century.solution(1988));

    }


    @Test
    public void test4() {
        assertEquals(20, century.solution(2000));

    }

    @Test
    public void test5() {

        assertEquals(21, century.solution(2011));

    }

    @Test
    public void test6() {

        assertEquals(2, century.solution(200));


    }

    @Test
    public void test7() {
        assertEquals(4, century.solution(374));

    }

    @Test
    public void test8() {

        assertEquals(1, century.solution(45));

    }

    @Test
    public void test9() {

        assertEquals(1, century.solution(8));
    }
}

