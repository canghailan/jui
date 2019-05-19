package cc.whohow.jui.rendering;

import cc.whohow.jui.engine.Canvas;
import cc.whohow.jui.engine.Engine;
import cc.whohow.jui.engine.Offset;
import cc.whohow.jui.engine.Rect;
import cc.whohow.jui.painting.ClipContext;

public class PaintingContext extends ClipContext {
    private final ContainerLayer containerLayer;
    private final Rect estimatedBounds;
    private Engine engine;
    private Canvas canvas;

    public PaintingContext(ContainerLayer containerLayer, Rect estimatedBounds) {
        this.containerLayer = containerLayer;
        this.estimatedBounds = estimatedBounds;
    }

    public void paintChild(RenderObject child, Offset offset) {

    }

    public Canvas getCanvas() {
        return canvas;
    }
}
