package com.sekureme.legal.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class RevisionHistory {
    private String version;
    private String date;
    private String changes;

    // Getters and Setters

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChanges() {
        return this.changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }
}