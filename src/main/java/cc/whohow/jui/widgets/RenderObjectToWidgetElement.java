package cc.whohow.jui.widgets;

import cc.whohow.jui.rendering.RenderObject;

public class RenderObjectToWidgetElement<T extends RenderObject> extends RootRenderObjectElement {
    public RenderObjectToWidgetElement(RenderObjectToWidgetAdapter<T> widget) {
        super(widget);
    }

    @Override
    public RenderObjectToWidgetAdapter<T> getWidget() {
        return (RenderObjectToWidgetAdapter<T>) super.getWidget();
    }
}
