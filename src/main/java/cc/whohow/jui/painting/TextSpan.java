package cc.whohow.jui.painting;

import cc.whohow.jui.engine.ParagraphBuilder;
import cc.whohow.jui.foundation.DiagnosticableTree;

import java.util.List;

public class TextSpan extends DiagnosticableTree {
    private String text;
    private TextStyle style;
    private List<TextSpan> children;

    public TextSpan(String text, TextStyle style, List<TextSpan> children) {
        this.text = text;
        this.style = style;
        this.children = children;
    }

    public void build(ParagraphBuilder builder, double textScaleFactor) {

    }
}
