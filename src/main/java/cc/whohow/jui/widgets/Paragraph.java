package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;
import cc.whohow.jui.painting.TextSpan;
import cc.whohow.jui.rendering.RenderParagraph;

public class Paragraph extends LeafRenderObjectWidget {
    private final TextSpan text;

    protected Paragraph(Key key, TextSpan text) {
        super(key);
        this.text = text;
    }

    @Override
    protected RenderParagraph createRenderObject(BuildContext context) {
        return new RenderParagraph(text);
    }
}
