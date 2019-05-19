package cc.whohow.jui.rendering;

import cc.whohow.jui.engine.Offset;
import cc.whohow.jui.painting.TextPainter;
import cc.whohow.jui.painting.TextSpan;

public class RenderParagraph extends RenderBox {
    private final TextPainter textPainter;

    public RenderParagraph(TextSpan text) {
        this.textPainter = new TextPainter(text);
    }

    @Override
    protected void performResize() {

    }

    @Override
    protected void performLayout() {

    }


    private void layoutText() {
        layoutText(0.0, Double.POSITIVE_INFINITY);
    }

    private void layoutText(double minWidth, double maxWidth) {
        textPainter.layout(minWidth, maxWidth);
    }

    public void paint(PaintingContext context, Offset offset) {
        textPainter.paint(context.getCanvas(), offset);
    }
}
