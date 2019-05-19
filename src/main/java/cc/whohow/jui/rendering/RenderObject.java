package cc.whohow.jui.rendering;

import cc.whohow.jui.engine.Offset;
import cc.whohow.jui.foundation.AbstractNode;

public abstract class RenderObject extends AbstractNode {
    private Constraints constraints;
    private ParentData parentData;

    private void paint() {

    }

    void visitChildren(RenderObjectVisitor visitor) {
    }

    void layout(Constraints constraints) {

    }

    protected abstract void performResize();

    protected abstract void performLayout();

    public void paint(PaintingContext context, Offset offset) {
    }
}
