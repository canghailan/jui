package cc.whohow.jui.engine;

public class Picture {
    private final RecordingCanvas recordingCanvas;
    private final Rect cullRect;

    public Picture(RecordingCanvas recordingCanvas, Rect cullRect) {
        this.recordingCanvas = recordingCanvas;
        this.cullRect = cullRect;
    }

    public Image toImage(int width, int height) {
        return null;
    }

    public void dispose() {
    }
}
