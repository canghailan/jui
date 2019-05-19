package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;

public abstract class StatelessWidget extends Widget {
    protected StatelessWidget(Key key) {
        super(key);
    }

    @Override
    public StatelessElement createElement() {
        return new StatelessElement(this);
    }

    protected abstract Widget build(BuildContext context);
}
