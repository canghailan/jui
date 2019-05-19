package cc.whohow.jui.engine;

import java.util.List;

public interface Paragraph {
    double getWidth();

    double getHeight();

    double getLongestLine();

    double getMinIntrinsicWidth();

    double getMaxIntrinsicWidth();

    double getAlphabeticBaseline();

    double getIdeographicBaseline();

    boolean isDidExceedMaxLines();

    void layout(ParagraphConstraints constraints);

    List<TextBox> getBoxesForRange(int start, int end);

    int[] getWordBoundary(int offset);
}
