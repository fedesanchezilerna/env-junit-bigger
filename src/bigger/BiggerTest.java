package bigger;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class BiggerTest {

    @Test
    public void testSimple() {
        int[] array = {20, 25, 12, 4, 16};
        int expected = 25;
        assertEquals(expected, Bigger.bigger(array));
    }

    @Test
    public void testMultiple() {
        int[] array1 = {110, 5, 22, 33};
        int[] array2 = {22, 5, 33, 110};
        int[] array3 = {33, 110, 22, 5};
        int expected = 110;

        assertEquals(expected, Bigger.bigger(array1));
        assertEquals(expected, Bigger.bigger(array2));
        assertEquals(expected, Bigger.bigger(array3));
    }

    @Test
    public void testWithDuplicates() {
        int[] array = {115, 5, 6, -1, 115, 10, 0};
        int expected = 115;

        assertEquals(expected, Bigger.bigger(array));
    }

    @Test
    public void testWithOneValue() {
        int[] array = {12};
        int expected = 12;

        assertEquals(expected, Bigger.bigger(array));
    }

    @Test
    public void testNegativeValues() {
        int[] array = {-24, -16, -17, -22, -56};
        int expected = -16;

        assertEquals(expected, Bigger.bigger(array));
    }
}
