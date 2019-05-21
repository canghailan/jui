package cc.whohow.jui.widgets;

import cc.whohow.jui.engine.Engine;
import cc.whohow.jui.rendering.PipelineOwner;
import cc.whohow.jui.rendering.RenderBox;

public class WidgetsBinding {
    private Engine engine;
    private Element renderViewElement;
    private BuildOwner buildOwner;
    private PipelineOwner pipelineOwner;

    public static WidgetsBinding getInstance() {
        return null;
    }

    public Engine getEngine() {
        return null;
    }

    public RenderView getRenderView() {
        return (RenderView) pipelineOwner.getRootNode();
    }

    public void run(Widget widget) {
        renderViewElement = new RenderObjectToWidgetAdapter<RenderBox>(
                widget,
                getRenderView()
        ).attachToRenderTree(buildOwner, renderViewElement);
    }
}
