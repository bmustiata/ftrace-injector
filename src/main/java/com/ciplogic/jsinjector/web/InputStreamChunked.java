package com.ciplogic.jsinjector.web;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamChunked extends InputStream {
    private InputStreamLineSupport inputStream;

    private int availableBytes;
    private int readedBytes;

    public InputStreamChunked(InputStreamLineSupport inputStream) throws IOException {
        this.inputStream = inputStream;
        initializeChunk();
    }

    private void initializeChunk() throws IOException {
        String readedLine = inputStream.readLine();
        if (readedLine.isEmpty()) {
            readedLine = inputStream.readLine();
        }
        availableBytes = Integer.parseInt(readedLine, 16);
        readedBytes = 0;
    }

    @Override
    public int read() throws IOException {
        if (availableBytes > 0 && readedBytes >= availableBytes) { // end of chunk
            initializeChunk();
        }

        if (readedBytes < availableBytes) { // bytes available in the current chunk
            readedBytes++;

            return inputStream.read();
        }

        return -1;
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
    }
}
