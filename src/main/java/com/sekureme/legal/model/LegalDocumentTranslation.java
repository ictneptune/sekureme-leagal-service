package com.sekureme.legal.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "legal_document_translations")
public class LegalDocumentTranslation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "legal_document_id", referencedColumnName = "id")
    private LegalDocument legalDocument;

    private String language;

    private String legalDocumentSummary;

    private String legalDocumentContent;

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

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLegalDocumentSummary() {
        return this.legalDocumentSummary;
    }

    public void setLegalDocumentSummary(String legalDocumentSummary) {
        this.legalDocumentSummary = legalDocumentSummary;
    }

    public String getLegalDocumentContent() {
        return this.legalDocumentContent;
    }

    public void setLegalDocumentContent(String legalDocumentContent) {
        this.legalDocumentContent = legalDocumentContent;
    }

}
