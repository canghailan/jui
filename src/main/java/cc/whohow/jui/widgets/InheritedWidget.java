package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;

public abstract class InheritedWidget extends ProxyWidget {
    protected InheritedWidget(Key key, Widget child) {
        super(key, child);
    }

    @Override
    protected InheritedElement createElement() {
        return new InheritedElement(this);
    }
}
