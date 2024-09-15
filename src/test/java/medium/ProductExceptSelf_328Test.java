package medium;

import org.example.medium.ProductExceptSelf_328;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductExceptSelf_328Test {
    private ProductExceptSelf_328 pes328;

    @BeforeEach
    public void before() {
        pes328 = new ProductExceptSelf_328();
    }

    @Test
    public void Test1() {
        Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, pes328.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    @Test
    public void Test2ß() {
        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, pes328.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

}
