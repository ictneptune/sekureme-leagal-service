package com.sekureme.legal.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekureme.legal.model.LegalDocument;
import com.sekureme.legal.repository.LegalDocumentRepository;

@Service
public class LegalDocumentService {

    @Autowired
    private LegalDocumentRepository legalDocumentRepository;

    // Find all documents in a particular language
    public List<LegalDocument> getDocumentsByLanguage(String language) {
        return legalDocumentRepository.findByLanguage(language);
    }

    // Find a document by its name
    public Optional<LegalDocument> getDocumentByName(String name) {
        return legalDocumentRepository.findByName(name);
    }

    // Find documents created after a specific date
    public List<LegalDocument> getDocumentsCreatedAfter(LocalDateTime date) {
        return legalDocumentRepository.findByCreatedAtAfter(date);
    }

    // Create or update a legal document
    public LegalDocument saveDocument(LegalDocument document) {
        return legalDocumentRepository.save(document);
    }

    // Delete a document by ID
    public void deleteDocument(Long id) {
        legalDocumentRepository.deleteById(id);
    }

  // Retrieve all legal documents
  public List<LegalDocument> getAllDocuments() {
    return legalDocumentRepository.findAll();
}

// Retrieve a legal document by ID
public Optional<LegalDocument> getDocumentById(Long id) {
    return legalDocumentRepository.findById(id);
}

}
