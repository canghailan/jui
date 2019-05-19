package cc.whohow.jui.foundation;

public class AbstractNode {
    private int depth = 0;
    private Object owner;
    private AbstractNode parent;

    public int getDepth() {
        return depth;
    }

    public Object getOwner() {
        return owner;
    }

    boolean isAttached() {
        return owner != null;
    }

    public void redepthChildren() {
    }

    protected void redepthChild(AbstractNode child) {

    }

    public void attach(Object owner) {

    }

    public void detach() {

    }

    protected void adoptChild(AbstractNode child) {

    }

    protected void dropChild(AbstractNode child) {

    }
}
