package com.sekureme.legal.model;

import java.util.UUID;

public class ConsentDTO {
    private UUID consentId;
    private UUID userId;
    private UUID purposeId;
    private Boolean consentGiven;
    private String consentDate;
    private String revokedDate;

    public UUID getConsentId() {
        return this.consentId;
    }

    public void setConsentId(UUID consentId) {
        this.consentId = consentId;
    }

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getPurposeId() {
        return this.purposeId;
    }

    public void setPurposeId(UUID purposeId) {
        this.purposeId = purposeId;
    }

    public Boolean isConsentGiven() {
        return this.consentGiven;
    }

    public Boolean getConsentGiven() {
        return this.consentGiven;
    }

    public void setConsentGiven(Boolean consentGiven) {
        this.consentGiven = consentGiven;
    }

    public String getConsentDate() {
        return this.consentDate;
    }

    public void setConsentDate(String consentDate) {
        this.consentDate = consentDate;
    }

    public String getRevokedDate() {
        return this.revokedDate;
    }

    public void setRevokedDate(String revokedDate) {
        this.revokedDate = revokedDate;
    }

    // Getters and Setters
}