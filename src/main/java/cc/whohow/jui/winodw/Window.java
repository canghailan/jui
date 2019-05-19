package cc.whohow.jui.winodw;

import cc.whohow.jui.foundation.Key;
import cc.whohow.jui.widgets.Element;
import cc.whohow.jui.widgets.StatefulWidget;

import java.util.Locale;

public abstract class Window extends StatefulWidget {
    private Locale locale;

    protected Window(Key key) {
        super(key);
    }

    @Override
    protected Element createElement() {
        return null;
    }
}
