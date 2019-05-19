package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.DiagnosticableTree;
import cc.whohow.jui.foundation.Key;

import java.util.Objects;

public abstract class Widget extends DiagnosticableTree {
    protected final Key key;

    protected Widget(Key key) {
        this.key = key;
    }

    static boolean canUpdate(Widget oldWidget, Widget newWidget) {
        return oldWidget.getClass() == newWidget.getClass()
                && Objects.equals(oldWidget.key, newWidget.key);
    }

    public Key getKey() {
        return key;
    }

    protected abstract Element createElement();

    public String toStringShort() {
        return key == null ? getClass().toString() : getClass() + "-" + getKey();
    }
}
