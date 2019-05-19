package cc.whohow.jui.widgets;

import cc.whohow.jui.rendering.RenderObject;

public class RenderObjectElement extends Element {
    private RenderObject renderObject;

    public RenderObjectElement(RenderObjectWidget widget) {
        super(widget);
    }

    public RenderObjectWidget getWidget() {
        return (RenderObjectWidget) super.getWidget();
    }

    public RenderObject getRenderObject() {
        return renderObject;
    }

    @Override
    public void forgetChild(Element child) {

    }

    @Override
    protected void performRebuild() {

    }
}
