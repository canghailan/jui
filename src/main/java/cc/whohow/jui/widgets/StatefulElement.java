package cc.whohow.jui.widgets;

public class StatefulElement extends ComponentElement {
    private State<StatefulWidget> state;

    public StatefulElement(StatefulWidget widget) {
        super(widget);
    }

    public State<StatefulWidget> getState() {
        return state;
    }

    @Override
    protected Widget build() {
        return state.build(this);
    }

    @Override
    public void reassemble() {
        state.reassemble();
        super.reassemble();
    }

    public void update(StatefulWidget newWidget) {
        super.update(newWidget);
        dirty = true;
        state.setWidget(newWidget);
        rebuild();
    }

    @Override
    public void activate() {
        super.activate();
        markNeedsBuild();
    }

    @Override
    public void deactivate() {
        state.deactivate();
        super.deactivate();
    }

    @Override
    public void unmount() {
        super.unmount();
        state.dispose();
        state.setElement(null);
        state = null;
    }

    @Override
    public InheritedWidget inheritFromElement(InheritedElement ancestor, Object aspect) {
        return super.inheritFromElement(ancestor, aspect);
    }

    @Override
    public void didChangeDependencies() {
        super.didChangeDependencies();
        state.didChangeDependencies();
    }
}
