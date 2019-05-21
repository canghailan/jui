package cc.whohow.jui.widgets;

public class BuildOwner {
    private Runnable onBuildScheduled;

    public BuildOwner(Runnable onBuildScheduled) {
        this.onBuildScheduled = onBuildScheduled;
    }
}
