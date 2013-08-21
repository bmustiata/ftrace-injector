package com.ciplogic.jsinjector.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamLineSupport extends InputStream {
    private final String encoding;
    private InputStream inputStream;

    public InputStreamLineSupport(InputStream sourceInputStream, String encoding) {
        this.inputStream = sourceInputStream;
        this.encoding = encoding;
    }

    public String readLine() throws IOException {
        byte[] buffer = new byte[64];
        int index = 0;

        int readByte;


        readByte = read();
        while (readByte != -1 && readByte != '\n') {
            buffer[index++] = (byte) readByte;
            if (index == buffer.length) {
                buffer = Arrays.copyOf(buffer, buffer.length + 64);
            }
            readByte = read();
        }

        // if we actually read a \n, but the last character of the line is \r, means it's a Windows line terminator
        // so ignore it from the actual response.
        if (readByte == '\n' && index <= buffer.length &&  buffer[index - 1] == '\r') {
            index--;
        }

        return new String(buffer, 0, index, encoding);
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }

    @Override
    public long skip(long n) throws IOException {
        return inputStream.skip(n);
    }

    @Override
    public int available() throws IOException {
        return inputStream.available();
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
    }

    @Override
    public void mark(int readlimit) {
        inputStream.mark(readlimit);
    }

    @Override
    public void reset() throws IOException {
        inputStream.reset();
    }

    @Override
    public boolean markSupported() {
        return inputStream.markSupported();
    }

}
