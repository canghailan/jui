package cc.whohow.jui.engine;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public interface Image {
    int getWidth();

    int getHeight();

    CompletableFuture<ByteBuffer> toByteBuffer();

    void dispose();
}
