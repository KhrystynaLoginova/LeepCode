package hard;

import org.example.hard.MedianSortedArrays_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedianSortedArrays_4Test {
    private MedianSortedArrays_4 ms4;
    @BeforeEach
    public void before() {
        ms4 = new MedianSortedArrays_4();
    }
    @Test
    public void Test1() {
        Assertions.assertEquals(2, ms4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    public void Test2() {
        Assertions.assertEquals(2.5, ms4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}));
    }

    @Test
    public void Test3() {
        Assertions.assertEquals(2.5, ms4.findMedianSortedArrays(new int[]{}, new int[]{2, 3}));
    }

    @Test
    public void Test4() {
        Assertions.assertEquals(3,
                ms4.findMedianSortedArrays(
                        new int[]{1,1,1,1,1,1,1,1,1,1,4,4},
                        new int[]{1,3,4,4,4,4,4,4,4,4,4}));
    }

    @Test
    public void Test5() {
        Assertions.assertEquals(1, ms4.findMedianSortedArrays(new int[]{1, 1}, new int[]{1, 2}));
    }
}
