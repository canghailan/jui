package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;

public abstract class ProxyWidget extends Widget {
    protected final Widget child;

    protected ProxyWidget(Key key, Widget child) {
        super(key);
        this.child = child;
    }

    public Widget getChild() {
        return child;
    }
}
