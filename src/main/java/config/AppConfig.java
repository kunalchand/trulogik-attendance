package config;

public class AppConfig {
    private String edgeDriverPath;
    private Boolean browserOpenStatus;

    public AppConfig(String edgeDriverPath, Boolean browserOpenStatus) {
        this.edgeDriverPath = edgeDriverPath;
        this.browserOpenStatus = browserOpenStatus;
    }

    public String getEdgeDriverPath() {
        return edgeDriverPath;
    }

    public void setEdgeDriverPath(String edgeDriverPath) {
        this.edgeDriverPath = edgeDriverPath;
    }

    public Boolean getBrowserOpenStatus() {
        return browserOpenStatus;
    }

    public void setBrowserOpenStatus(Boolean browserOpenStatus) {
        this.browserOpenStatus = browserOpenStatus;
    }
    
}
