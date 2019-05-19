package cc.whohow.jui.engine;

import cc.whohow.jui.widgets.Widget;

public interface Engine {
    void run(Widget widget);

    ParagraphBuilder createParagraphBuilder(ParagraphStyle style);
}
