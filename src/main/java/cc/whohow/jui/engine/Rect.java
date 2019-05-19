package cc.whohow.jui.engine;

public class Rect {
    public static final Rect ZERO = new Rect(0.0, 0.0, 0.0, 0.0);
    public static final Rect LARGEST = new Rect(-1.0E+9, -1.0E+9, 1.0E+9, 1.0E+9);

    private final double left;
    private final double top;
    private final double right;
    private final double bottom;

    public Rect(double left, double top, double right, double bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }
}
