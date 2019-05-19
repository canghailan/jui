package cc.whohow.jui.widgets;

import cc.whohow.jui.foundation.Key;
import cc.whohow.jui.painting.TextSpan;

public class Text extends StatelessWidget {
    private TextSpan text;

    public Text(Key key, String text) {
        this(key, new TextSpan(text, null, null));
    }


    protected Text(Key key, TextSpan text) {
        super(key);
        this.text = text;
    }

    @Override
    protected Widget build(BuildContext context) {
        return new Paragraph(key, text);
    }
}
