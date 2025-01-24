package com.sekureme.legal.model;


import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consent_history")
public class ConsentHistory {
    @Id
    @GeneratedValue
    private UUID consentHistoryId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "purpose_id")
    private ConsentPurpose purpose;

    private Boolean consentGiven;

    private String consentDate;

    private String revokedDate;

    @Lob
    private byte[] ipAddress;

    @Lob
    private byte[] userAgent;

    private UUID deviceId;

    private String createdAt;

    private String updatedAt;

    // Getters and Setters

    public UUID getConsentHistoryId() {
        return this.consentHistoryId;
    }

    public void setConsentHistoryId(UUID consentHistoryId) {
        this.consentHistoryId = consentHistoryId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ConsentPurpose getPurpose() {
        return this.purpose;
    }

    public void setPurpose(ConsentPurpose purpose) {
        this.purpose = purpose;
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

    public byte[] getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public byte[] getUserAgent() {
        return this.userAgent;
    }

    public void setUserAgent(byte[] userAgent) {
        this.userAgent = userAgent;
    }

    public UUID getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}