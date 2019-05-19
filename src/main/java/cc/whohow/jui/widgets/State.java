package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Diagnosticable;

public abstract class State<T extends StatefulWidget> extends Diagnosticable {
    private T widget;
    private StatefulElement element;
    private StateLifecycle stateLifecycle = StateLifecycle.created;

    public T getWidget() {
        return widget;
    }

    public void setWidget(T widget) {
        this.widget = widget;
    }

    public void setElement(StatefulElement element) {
        this.element = element;
    }

    public BuildContext getContext() {
        return element;
    }

    public boolean isMounted() {
        return element != null;
    }

    void initState() {
        assert (stateLifecycle == StateLifecycle.created);
    }

    void didUpdateWidget(T oldWidget) {
    }

    void reassemble() {
    }

    void setState(Runnable fn) {
        assert (fn != null);
        fn.run();
        element.markNeedsBuild();
    }

    void deactivate() {
    }

    void dispose() {

    }

    abstract Widget build(BuildContext context);

    void didChangeDependencies() {
    }
}
