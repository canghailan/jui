package cc.whohow.jui.widgets;

public class GlobalObjectKey<T extends State<StatefulWidget>> extends GlobalKey<T> {
    private Object value;

    public GlobalObjectKey(Object value) {
        this.value = value;
    }
}
