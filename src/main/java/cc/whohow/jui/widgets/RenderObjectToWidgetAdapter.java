package cc.whohow.jui.widgets;

import cc.whohow.jui.rendering.RenderObject;

public class RenderObjectToWidgetAdapter<T extends RenderObject> extends RenderObjectWidget {
    private final Widget child;
    private final RenderObject container;

    protected RenderObjectToWidgetAdapter(Widget child, RenderObject container) {
        super(new GlobalObjectKey<>(container));
        this.child = child;
        this.container = container;
    }

    @Override
    protected RenderObjectElement createElement() {
        return new RenderObjectToWidgetElement<>(this);
    }

    @Override
    protected RenderObject createRenderObject(BuildContext context) {
        return container;
    }

    public Element attachToRenderTree(BuildOwner buildOwner, Element element) {
        if (element == null) {
            element = createElement();
        }
        return element;
    }
}
