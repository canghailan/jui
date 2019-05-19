package cc.whohow.jui.painting;

import cc.whohow.jui.engine.*;
import cc.whohow.jui.widgets.WidgetsBinding;

public class TextPainter {
    private TextSpan text;
    private Paragraph paragraph;

    public TextPainter(TextSpan text) {
        this.text = text;
    }

    public TextSpan getText() {
        return text;
    }

    public void setText(TextSpan text) {
        this.text = text;
    }

    public void layout(double minWidth, double maxWidth) {
        ParagraphBuilder builder = WidgetsBinding.getInstance().getEngine().createParagraphBuilder(null);
        paragraph = builder.build();
        paragraph.layout(new ParagraphConstraints(maxWidth));
    }

    public void paint(Canvas canvas, Offset offset) {
        canvas.drawParagraph(paragraph, offset);
    }
}
