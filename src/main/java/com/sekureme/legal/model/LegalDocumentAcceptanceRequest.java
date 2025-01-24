package com.sekureme.legal.model;

import java.time.Duration;

public class LegalDocumentAcceptanceRequest {

    private Long legalDocId;
    private String acceptedBy;
    private String deviceInformation;
    private String ip;
    private String browserName;
    private Duration timeToAccept;

    // Getter and Setter methods

    public Long getLegalDocId() {
        return this.legalDocId;
    }

    public void setLegalDocId(Long legalDocId) {
        this.legalDocId = legalDocId;
    }

    public String getAcceptedBy() {
        return this.acceptedBy;
    }

    public void setAcceptedBy(String acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public String getDeviceInformation() {
        return this.deviceInformation;
    }

    public void setDeviceInformation(String deviceInformation) {
        this.deviceInformation = deviceInformation;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowserName() {
        return this.browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public Duration getTimeToAccept() {
        return this.timeToAccept;
    }

    public void setTimeToAccept(Duration timeToAccept) {
        this.timeToAccept = timeToAccept;
    }

}
