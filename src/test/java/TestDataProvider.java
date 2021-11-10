import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider
    public static Object[][] positiveAdditionData() {
        return new Object[][]{
                {-1, Integer.MIN_VALUE, Integer.MAX_VALUE},
                {4, 2, 2},
                {0, -1, 1},
                {8, 4, 4},
                {-1, 0, -1},
                {2, 2, 0}
        };
    }


    @DataProvider
    public static Object[][] positiveSubtractionData() {
        return new Object[][]{
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0},
                {0, 2, 2},
                {-2, -1, 1},
                {4, 8, 4},
                {1, 0, -1},
                {10, 10, 0},

        };
    }


    @DataProvider
    public static Object[][] positiveMultiplyData() {
        return new Object[][]{
                {4, 2, 2},
                {-1, -1, 1},
                {16, 4, 4},
                {0, 0, -1},
                {6, 2, 3}
        };
    }


    @DataProvider
    public static Object[][] positiveDivisionData() {
        return new Object[][]{
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 1},
                {1, 2, 2},
                {-1, -1, 1},
                {1, 4, 4},
                {0, 0, -1},
                {2, 8, 4}
        };
    }


    @DataProvider
    public static Object[][] negativeData() {
        return new Object[][]{
                {0, 25, 21},
                {13, -17, 1},
                {1009, 47, 45},
                {71, 0, -14},
                {-31, 22, 33},
        };
    }

    @DataProvider
    public static Object[][] testObjectData() {
        return new Object[][]{
                {"five", 20, 20},
                {10, -10, "one"},
                {1000, "four", 4},
                {"seven", "0", -10},
                {6, null, 8}
        };
    }
}