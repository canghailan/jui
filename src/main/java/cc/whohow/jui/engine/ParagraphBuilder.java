package cc.whohow.jui.engine;

public interface ParagraphBuilder {
    void pushStyle(TextStyle style);

    void pop();

    void addText(String text);

    Paragraph build();
}
