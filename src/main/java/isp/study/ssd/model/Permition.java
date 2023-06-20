package isp.study.ssd.model;

public enum Permition {
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write");
    private final String permition;

    Permition(String permition) {
        this.permition = permition;
    }

    public String getPermition() {
        return permition;
    }
}
