package colorcoder;

public class ColorUtilTest {
    public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
        ColorPair colorPair = ColorUtil.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        int pairNumber = ColorUtil.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}
