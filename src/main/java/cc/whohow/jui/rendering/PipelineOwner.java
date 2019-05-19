package cc.whohow.jui.rendering;

public class PipelineOwner {
    private final Runnable onNeedVisualUpdate;
    private final Runnable onSemanticsOwnerCreated;
    private final Runnable onSemanticsOwnerDisposed;

    public PipelineOwner(Runnable onNeedVisualUpdate,
                         Runnable onSemanticsOwnerCreated,
                         Runnable onSemanticsOwnerDisposed) {
        this.onNeedVisualUpdate = onNeedVisualUpdate;
        this.onSemanticsOwnerCreated = onSemanticsOwnerCreated;
        this.onSemanticsOwnerDisposed = onSemanticsOwnerDisposed;
    }
}
