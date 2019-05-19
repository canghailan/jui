package cc.whohow.jui.engine;

public class Canvas {
    private RecordingCanvas canvas;

    public Canvas(PictureRecorder recorder, Rect cullRect) {
        if (recorder.isRecording()) {
            throw new IllegalArgumentException();
        }
        canvas = recorder.beginRecording(cullRect == null ? Rect.LARGEST : cullRect);
    }

    public void drawParagraph(Paragraph paragraph, Offset offset) {
        canvas.drawParagraph(paragraph, offset);
    }
}
