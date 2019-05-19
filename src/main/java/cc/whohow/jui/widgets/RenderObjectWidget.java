package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;
import cc.whohow.jui.rendering.RenderObject;

public abstract class RenderObjectWidget extends Widget {
    protected RenderObjectWidget(Key key) {
        super(key);
    }

    @Override
    protected abstract RenderObjectElement createElement();

    protected abstract RenderObject createRenderObject(BuildContext context);

}
