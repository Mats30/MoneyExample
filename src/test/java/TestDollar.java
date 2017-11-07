import org.testng.annotations.Test;
import org.testng.Assert;


public class TestDollar {

    @Test(groups = "multiplication")
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(product.amount, 10);
        product = five.times(3);
        Assert.assertEquals(product.amount, 15);
    }
}
