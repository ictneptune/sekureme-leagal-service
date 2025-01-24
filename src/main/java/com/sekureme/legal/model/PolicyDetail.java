package com.sekureme.legal.model;


import jakarta.persistence.Embeddable;

@Embeddable
public class PolicyDetail {
    private String policyTitle;
    private String description;
    private String policyURL;

    // Getters and Setters

    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPolicyURL() {
        return policyURL;
    }

    public void setPolicyURL(String policyURL) {
        this.policyURL = policyURL;
    }
}
