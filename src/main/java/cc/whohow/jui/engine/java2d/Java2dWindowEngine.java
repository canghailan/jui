package cc.whohow.jui.engine.java2d;

import cc.whohow.jui.engine.Engine;
import cc.whohow.jui.engine.ParagraphBuilder;
import cc.whohow.jui.engine.ParagraphStyle;
import cc.whohow.jui.foundation.ValueKey;
import cc.whohow.jui.tex.TexParagraphBuilder;
import cc.whohow.jui.widgets.Text;
import cc.whohow.jui.widgets.Widget;

public class Java2dWindowEngine implements Engine {
    public static void main(String[] args) {
        new Java2dWindowEngine().run(new Text(new ValueKey<>("a"), "a"));
    }

    @Override
    public void run(Widget widget) {
        new Java2dWindow(widget).setVisible(true);
    }

    @Override
    public ParagraphBuilder createParagraphBuilder(ParagraphStyle style) {
        return new TexParagraphBuilder(style);
    }
}
