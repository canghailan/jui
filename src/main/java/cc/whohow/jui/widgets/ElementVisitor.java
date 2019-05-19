package cc.whohow.jui.widgets;

@FunctionalInterface
public interface ElementVisitor {
    boolean visit(Element element);
}
