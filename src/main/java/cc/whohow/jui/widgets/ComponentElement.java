package cc.whohow.jui.widgets;

public abstract class ComponentElement extends Element {
    private Element child;

    public ComponentElement(Widget widget) {
        super(widget);
    }

    @Override
    public void mount(Element parent, Object newSlot) {
        super.mount(parent, newSlot);
        rebuild();
    }

    @Override
    protected void performRebuild() {
        Widget built = build();
        child = updateChild(child, built, slot);
    }

    protected abstract Widget build();

    @Override
    public void visitChildren(ElementVisitor visitor) {
        if (child != null) {
            visitor.visit(child);
        }
    }

    @Override
    public void forgetChild(Element child) {
        assert (this.child == child);
        this.child = null;
    }
}
