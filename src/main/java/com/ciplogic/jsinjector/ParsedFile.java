package com.ciplogic.jsinjector;

public class ParsedFile {
    private String path;
    private String debugName;

    public ParsedFile(String path, String debugName) {
        this.path = path;
        this.debugName = debugName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDebugName() {
        return debugName;
    }

    public void setDebugName(String debugName) {
        this.debugName = debugName;
    }
}
