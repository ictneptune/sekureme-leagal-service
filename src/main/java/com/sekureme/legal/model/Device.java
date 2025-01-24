package com.sekureme.legal.model;


import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue
    private UUID deviceId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "device_type", length = 50)
    private String deviceType;

    @Column(name = "device_identifier", length = 255)
    private String deviceIdentifier;

    @Column(name = "browser_version", length = 50)
    private String browserVersion;

    @Column(name = "os_version", length = 50)
    private String osVersion;

    //@Column(name = "last_used", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    @Column(name = "last_used")
    private String lastUsed;

    //@Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    @Column(name = "created_at")
    private String createdAt;

    //@Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    @Column(name = "updated_at")
    private String updatedAt;

    // Getters and Setters

    public UUID getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    public String getBrowserVersion() {
        return this.browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getLastUsed() {
        return this.lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
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
