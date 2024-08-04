package colorcoder;

public class Main {
    public static void main(String[] args) {
        // Test color pair conversions
        ColorUtilTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorUtilTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        ColorUtilTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorUtilTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        // Print the color coding reference manual
        System.out.println("Color Coding Reference Manual:\n");
        System.out.println(ColorUtil.getColorManual());
    }
}

