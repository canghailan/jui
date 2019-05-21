package cc.whohow.jui.rendering;

import cc.whohow.jui.foundation.AbstractNode;

public class PipelineOwner {
    private final Runnable onNeedVisualUpdate;
    private final Runnable onSemanticsOwnerCreated;
    private final Runnable onSemanticsOwnerDisposed;
    private AbstractNode rootNode;

    public PipelineOwner(Runnable onNeedVisualUpdate,
                         Runnable onSemanticsOwnerCreated,
                         Runnable onSemanticsOwnerDisposed) {
        this.onNeedVisualUpdate = onNeedVisualUpdate;
        this.onSemanticsOwnerCreated = onSemanticsOwnerCreated;
        this.onSemanticsOwnerDisposed = onSemanticsOwnerDisposed;
    }

    public AbstractNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(AbstractNode rootNode) {
        this.rootNode = rootNode;
    }
}
