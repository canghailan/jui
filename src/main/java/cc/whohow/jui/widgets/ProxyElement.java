package cc.whohow.jui.widgets;

public abstract class ProxyElement extends ComponentElement {
    public ProxyElement(ProxyWidget widget) {
        super(widget);
    }

    @Override
    public ProxyWidget getWidget() {
        return (ProxyWidget) super.getWidget();
    }

    @Override
    protected Widget build() {
        return getWidget().getChild();
    }
}
