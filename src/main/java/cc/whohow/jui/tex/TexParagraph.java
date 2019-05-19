package cc.whohow.jui.tex;

import cc.whohow.jui.engine.Paragraph;
import cc.whohow.jui.engine.ParagraphConstraints;
import cc.whohow.jui.engine.TextBox;

import java.util.List;

public class TexParagraph implements Paragraph {
    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getLongestLine() {
        return 0;
    }

    @Override
    public double getMinIntrinsicWidth() {
        return 0;
    }

    @Override
    public double getMaxIntrinsicWidth() {
        return 0;
    }

    @Override
    public double getAlphabeticBaseline() {
        return 0;
    }

    @Override
    public double getIdeographicBaseline() {
        return 0;
    }

    @Override
    public boolean isDidExceedMaxLines() {
        return false;
    }

    @Override
    public void layout(ParagraphConstraints constraints) {

    }

    @Override
    public List<TextBox> getBoxesForRange(int start, int end) {
        return null;
    }

    @Override
    public int[] getWordBoundary(int offset) {
        return new int[0];
    }
}
