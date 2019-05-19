package cc.whohow.jui.widgets;

public class InheritedElement extends ProxyElement {
    public InheritedElement(InheritedWidget widget) {
        super(widget);
    }

    @Override
    public InheritedWidget getWidget() {
        return (InheritedWidget) super.getWidget();
    }
}
