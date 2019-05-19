package cc.whohow.jui.engine;

public interface PictureRecorder {
//    private RecordingCanvas canvas;
//    private Rect cullRect;
//    private boolean recording = false;
//
//    public RecordingCanvas beginRecording(Rect bounds) {
//        assert (!recording);
//        cullRect = bounds;
//        recording = true;
//        canvas = new RecordingCanvas(cullRect);
//        return canvas;
//    }
//
//    public boolean isRecording() {
//        return recording;
//    }
//
//    public Picture endRecording() {
//        if (!recording) {
//            return null;
//        }
//        recording = false;
//        return new Picture(canvas, cullRect);
//    }

    boolean isRecording();

    RecordingCanvas beginRecording(Rect bounds);

    Picture endRecording();
}
