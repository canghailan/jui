package cc.whohow.jui.tex;

import cc.whohow.jui.engine.Paragraph;
import cc.whohow.jui.engine.ParagraphBuilder;
import cc.whohow.jui.engine.ParagraphStyle;
import cc.whohow.jui.engine.TextStyle;

public class TexParagraphBuilder implements ParagraphBuilder {
    private ParagraphStyle style;

    public TexParagraphBuilder(ParagraphStyle style) {
        this.style = style;
    }

    @Override
    public void pushStyle(TextStyle style) {

    }

    @Override
    public void pop() {

    }

    @Override
    public void addText(String text) {

    }

    @Override
    public Paragraph build() {
        return null;
    }
}
