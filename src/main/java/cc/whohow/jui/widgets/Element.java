package cc.whohow.jui.widgets;

import cc.whohow.jui.engine.Size;
import cc.whohow.jui.foundation.DiagnosticableTree;
import cc.whohow.jui.rendering.RenderBox;
import cc.whohow.jui.rendering.RenderObject;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public abstract class Element extends DiagnosticableTree implements BuildContext {
    protected Widget widget;
    protected Element parent;
    protected Object slot;
    protected int depth;
    protected BuildOwner owner;
    protected boolean active = false;
    protected Map<Type, InheritedElement> inheritedWidgets;
    protected Set<InheritedElement> dependencies;
    protected boolean hadUnsatisfiedDependencies = false;
    protected boolean dirty;

    public Element(Widget widget) {
        assert (widget != null);
        this.widget = widget;
    }


    public Object getSlot() {
        return slot;
    }

    public int getDepth() {
        return depth;
    }

    public Widget getWidget() {
        return widget;
    }

    public BuildOwner getOwner() {
        return owner;
    }

    public void reassemble() {
        markNeedsBuild();

    }

    public RenderObject getRenderObject() {
        return null;
    }

    public void visitChildren(ElementVisitor visitor) {
    }

    public void visitChildElements(ElementVisitor visitor) {
        visitChildren(visitor);
    }

    public Element updateChild(Element child, Widget newWidget, Object newSlot) {
        return null;
    }

    public void mount(Element parent, Object newSlot) {

    }

    public void update(Widget newWidget) {

    }

    public void updateSlotForChild(Element child, Object newSlot) {

    }

    public void detachRenderObject() {

    }

    public void attachRenderObject(Object newSlot) {

    }

    public Element inflateWidget(Widget newWidget, Object newSlot) {
        return null;
    }

    public void deactivateChild(Element child) {

    }

    public abstract void forgetChild(Element child);

    public void activate() {

    }

    public void deactivate() {

    }

    public void unmount() {

    }

    public RenderObject findRenderObject() {
        return getRenderObject();
    }

    public Size getSize() {
        RenderObject renderObject = findRenderObject();
        if (renderObject instanceof RenderBox) {
            return ((RenderBox) renderObject).getSize();
        }
        return null;
    }

    public InheritedWidget inheritFromElement(InheritedElement ancestor, Object aspect) {
        return null;
    }

    public InheritedWidget inheritFromWidgetOfExactType(Type targetType, Object aspect) {
        return null;
    }

    public InheritedElement ancestorInheritedElementForWidgetOfExactType(Type targetType) {
        return null;
    }

    public Widget ancestorWidgetOfExactType(Type targetType) {
        return null;
    }

    public State ancestorStateOfType(TypeMatcher matcher) {
        return null;
    }

    public State rootAncestorStateOfType(TypeMatcher matcher) {
        return null;
    }

    public RenderObject ancestorRenderObjectOfType(TypeMatcher matcher) {
        return null;
    }

    public void visitAncestorElements(ElementVisitor visitor) {

    }

    public void didChangeDependencies() {

    }

    public boolean isDirty() {
        return dirty;
    }

    public void markNeedsBuild() {

    }

    public void rebuild() {

    }

    protected abstract void performRebuild();
}
