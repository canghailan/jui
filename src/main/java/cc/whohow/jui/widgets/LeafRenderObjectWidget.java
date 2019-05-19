package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;

public abstract class LeafRenderObjectWidget extends RenderObjectWidget {
    protected LeafRenderObjectWidget(Key key) {
        super(key);
    }

    @Override
    protected LeafRenderObjectElement createElement() {
        return new LeafRenderObjectElement(this);
    }
}
