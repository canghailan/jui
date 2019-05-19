package cc.whohow.jui.widgets;

public class StatelessElement extends ComponentElement {
    public StatelessElement(StatelessWidget widget) {
        super(widget);
    }

    @Override
    public StatelessWidget getWidget() {
        return (StatelessWidget) super.getWidget();
    }

    @Override
    protected Widget build() {
        return getWidget().build(this);
    }
}
