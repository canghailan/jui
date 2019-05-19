package cc.whohow.jui.rendering;

@FunctionalInterface
public interface RenderObjectVisitor {
    void visit(RenderObject child);
}
