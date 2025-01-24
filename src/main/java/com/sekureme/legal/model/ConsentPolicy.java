package com.sekureme.legal.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consent_policies")
public class ConsentPolicy {
    @Id
    @GeneratedValue
    private UUID policyId;

    @ElementCollection
    private Map<String, PolicyDetail> policy;

    private String status;

    @ElementCollection
    private List<String> locations;

    @ElementCollection
    private List<String> languages;

    private String effectiveDate;

    private String version;

    @ElementCollection
    private List<RevisionHistory> revisionHistory;

    // Getters and Setters

    public UUID getPolicyId() {
        return policyId;
    }

    public void setPolicyId(UUID policyId) {
        this.policyId = policyId;
    }

    public Map<String, PolicyDetail> getPolicy() {
        return policy;
    }

    public void setPolicy(Map<String, PolicyDetail> policy) {
        this.policy = policy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<RevisionHistory> getRevisionHistory() {
        return revisionHistory;
    }

    public void setRevisionHistory(List<RevisionHistory> revisionHistory) {
        this.revisionHistory = revisionHistory;
    }
}