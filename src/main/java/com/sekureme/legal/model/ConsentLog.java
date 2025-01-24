package com.sekureme.legal.model;


import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consent_logs")
public class ConsentLog {
    @Id
    @GeneratedValue
    private UUID logId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "purpose_id", nullable = false)
    private ConsentPurpose purpose;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(name = "consent_given", nullable = false)
    private Boolean consentGiven;

    // @Column(name = "consent_date", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    @Column(name = "consent_date")
    private String consentDate;

    @Lob
    @Column(name = "ip_address")
    private byte[] ipAddress;

    @Lob
    @Column(name = "user_agent")
    private byte[] userAgent;

    @Column(name = "action", length = 50)
    private String action;

    //@Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    @Column(name = "created_at")
    private String createdAt;

   // @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
   @Column(name = "updated_at")
    private String updatedAt;

    // Getters and Setters

    public UUID getLogId() {
        return this.logId;
    }

    public void setLogId(UUID logId) {
        this.logId = logId;
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

    public Device getDevice() {
        return this.device;
    }

    public void setDevice(Device device) {
        this.device = device;
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

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
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