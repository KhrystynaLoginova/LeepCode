package easy;

import org.example.easy.CanPlaceFlowers_605;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowers_605Test {
    private CanPlaceFlowers_605 cpf605;

    @BeforeEach
    public void before() {
        cpf605 = new CanPlaceFlowers_605();
    }

    @Test
    public void Test1() {
        Assertions.assertEquals(true,
                cpf605.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    public void Test2() {
        Assertions.assertEquals(false,
                cpf605.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }

    @Test
    public void Test3() {
        Assertions.assertEquals(true,
                cpf605.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
    }

    @Test
    public void Test4() {
        Assertions.assertEquals(false,
                cpf605.canPlaceFlowers(new int[]{0, 1, 0}, 1));
    }
}
