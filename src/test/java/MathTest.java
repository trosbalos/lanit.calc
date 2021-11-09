import org.testng.Assert;
import org.testng.annotations.Test;

public class MathTest extends BaseTest {
    Math math = new Math();
//Addition
    @Test(dataProvider = "positiveAdditionData",dataProviderClass = TestDataProvider.class)
    public void additionTest(int one, int two, int tree) {
        Assert.assertEquals(one, math.addition(two,tree), "Значения не равны!");
    }
    @Test(dataProvider = "negativeData",dataProviderClass = TestDataProvider.class)
    public void additionNegativeTest(int one, int two, int tree) {
        Assert.assertNotEquals(one, math.addition(two,tree), "Значения равны!");
    }
    @Test(dataProvider = "testObjectData",dataProviderClass = TestDataProvider.class, expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void additionNegativeObjectTest(Object one, Object two, Object tree) {
        Assert.assertEquals(one, math.addition(two,tree), "Значения не равны!");
    }
//Subtraction
    @Test(dataProvider = "positiveSubtractionData",dataProviderClass = TestDataProvider.class)
    public void subtractionTest(int one, int two, int tree) {
    Assert.assertEquals(one, math.subtraction(two,tree), "Значения не равны!");
}
    @Test(dataProvider = "negativeData",dataProviderClass = TestDataProvider.class)
    public void subtractionNegativeTest(int one, int two, int tree) {
        Assert.assertNotEquals(one, math.subtraction(two,tree), "Значения равны!");
    }
    @Test(dataProvider = "testObjectData",dataProviderClass = TestDataProvider.class, expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void subtractionNegativeObjectTest(Object one, Object two, Object tree) {
        Assert.assertEquals(one, math.subtraction(two,tree), "Значения не равны!");
    }
//Multiply
    @Test(dataProvider = "positiveMultiplyData",dataProviderClass = TestDataProvider.class)
    public void multiplyTest(int one, int two, int tree) {
    Assert.assertEquals(one, math.multiply(two,tree), "Значения не равны!");
}
    @Test(dataProvider = "negativeData",dataProviderClass = TestDataProvider.class)
    public void multiplyNegativeTest(int one, int two, int tree) {
        Assert.assertNotEquals(one, math.multiply(two,tree), "Значения равны!");
    }
    @Test(dataProvider = "testObjectData",dataProviderClass = TestDataProvider.class, expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void multiplyNegativeObjectTest(Object one, Object two, Object tree) {
        Assert.assertEquals(one, math.multiply(two,tree), "Значения не равны!");
    }
//Division
    @Test(dataProvider = "positiveDivisionData",dataProviderClass = TestDataProvider.class)
    public void divisionTest(int one, int two, int tree) {
    Assert.assertEquals(one, math.division(two,tree), "Значения не равны!");
}
    @Test(dataProvider = "negativeData",dataProviderClass = TestDataProvider.class)
    public void divisionNegativeTest(int one, int two, int tree) {
        Assert.assertNotEquals(one, math.division(two,tree), "Значения равны!");
    }
    @Test(dataProvider = "testObjectData",dataProviderClass = TestDataProvider.class, expectedExceptions = {ClassCastException.class, NullPointerException.class, AssertionError.class})
    public void divisionNegativeObjectTest(Object one, Object two, Object tree) {
        Assert.assertEquals(one, math.division(two,tree), "Значения не равны!");
    }




}
