package com.basejava.webapp.model;

public class Resume {
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String toString() {
        return uuid;
    }

    public Resume(String uuid) {
        this.uuid = uuid;
    }
}
