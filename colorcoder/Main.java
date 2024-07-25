package colorcoder;

public class Main {

    public static void main(String[] args) {
        ColorUtil.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorUtil.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        ColorUtil.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorUtil.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        System.out.println("Color Coding Reference Manual:\n");
        System.out.println(ColorUtil.getColorManual());
    }
}
