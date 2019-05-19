package cc.whohow.jui.foundation;

import java.util.Objects;

public class ValueKey<T> implements LocalKey {
    private final T value;

    public ValueKey(T value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        ValueKey<?> that = (ValueKey) o;
        return Objects.equals(value, that.value);
    }
}
