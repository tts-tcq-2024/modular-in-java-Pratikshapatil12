package colorcoder;

public class ColorUtil {
    public final static String MajorColorNames[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
    public final static String MinorColorNames[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };

    public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / MinorColor.values().length);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % MinorColor.values().length);
        return new ColorPair(majorColor, minorColor);
    }

    public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
    }

    public static String getColorManual() {
        StringBuilder manual = new StringBuilder();
        for (int i = 1; i <= MajorColor.values().length; i++) {
            for (int j = 1; j <= MinorColor.values().length; j++) {
                int pairNumber = GetPairNumberFromColor(MajorColor.fromIndex(i - 1), MinorColor.fromIndex(j - 1));
                manual.append(pairNumber)
                      .append(": ")
                      .append(MajorColorNames[i - 1])
                      .append(" ")
                      .append(MinorColorNames[j - 1])
                      .append("\n");
            }
        }
        return manual.toString();
    }
}
