package com.sekureme.legal.model;


import java.time.Duration;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "legal_document_acceptance")
public class LegalDocumentAcceptance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "legal_doc_id")
    private LegalDocument legalDocument;

    private String acceptedBy;

    private LocalDateTime acceptedAt;

    private String deviceInformation;

    private String ip;

    private String browserName;

    private Duration timeToAccept;

    // Getter and Setter methods

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LegalDocument getLegalDocument() {
        return this.legalDocument;
    }

    public void setLegalDocument(LegalDocument legalDocument) {
        this.legalDocument = legalDocument;
    }

    public String getAcceptedBy() {
        return this.acceptedBy;
    }

    public void setAcceptedBy(String acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public LocalDateTime getAcceptedAt() {
        return this.acceptedAt;
    }

    public void setAcceptedAt(LocalDateTime acceptedAt) {
        this.acceptedAt = acceptedAt;
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
