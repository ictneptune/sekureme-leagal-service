package com.sekureme.legal.model;


import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "consent_text_translations", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"purpose_id", "language_code"})
})
public class ConsentTextTranslation {
    @Id
    @GeneratedValue
    private UUID translationId;

    @ManyToOne
    @JoinColumn(name = "purpose_id", nullable = false)
    private ConsentPurpose purpose;

    @Column(name = "language_code", length = 10, nullable = false)
    private String languageCode;

    @Column(name = "consent_text", columnDefinition = "TEXT")
    private String consentText;

    //@Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
   @Column(name = "created_at")
    private String createdAt;

    //@Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT NOW()")
    @Column(name = "updated_at")
    private String updatedAt;

    // Getters and Setters

    public UUID getTranslationId() {
        return this.translationId;
    }

    public void setTranslationId(UUID translationId) {
        this.translationId = translationId;
    }

    public ConsentPurpose getPurpose() {
        return this.purpose;
    }

    public void setPurpose(ConsentPurpose purpose) {
        this.purpose = purpose;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getConsentText() {
        return this.consentText;
    }

    public void setConsentText(String consentText) {
        this.consentText = consentText;
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