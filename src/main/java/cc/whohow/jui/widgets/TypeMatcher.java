package cc.whohow.jui.widgets;

@FunctionalInterface
public interface TypeMatcher<T> {
    boolean check(Object object);
}
