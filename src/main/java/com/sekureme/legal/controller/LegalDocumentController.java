package com.sekureme.legal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sekureme.legal.model.LegalDocument;
import com.sekureme.legal.service.LegalDocumentService;

@RestController
@RequestMapping("/api/legal-documents")
public class LegalDocumentController {

    @Autowired
    private LegalDocumentService legalDocumentService;

    // Create or update a legal document
    @PostMapping
    public ResponseEntity<LegalDocument> createLegalDocument(@RequestBody LegalDocument legalDocument) {
        LegalDocument createdDocument = legalDocumentService.saveDocument(legalDocument);
        return new ResponseEntity<>(createdDocument, HttpStatus.CREATED);
    }

    // Get all legal documents, optionally filtered by language
    @GetMapping
    public ResponseEntity<List<LegalDocument>> getLegalDocuments(@RequestParam(value = "language", required = false) String language) {
        List<LegalDocument> documents;
        if (language != null) {
            documents = legalDocumentService.getDocumentsByLanguage(language);
        } else {
            documents = legalDocumentService.getAllDocuments();
        }
        return new ResponseEntity<>(documents, HttpStatus.OK);
    }

    // Get a legal document by ID
    @GetMapping("/{id}")
    public ResponseEntity<LegalDocument> getLegalDocumentById(@PathVariable Long id) {
        Optional<LegalDocument> document = legalDocumentService.getDocumentById(id);
        return document.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update an existing legal document
    @PutMapping("/{id}")
    public ResponseEntity<LegalDocument> updateLegalDocument(@PathVariable Long id, @RequestBody LegalDocument legalDocument) {
        Optional<LegalDocument> existingDocument = legalDocumentService.getDocumentById(id);
        if (existingDocument.isPresent()) {
            legalDocument.setId(id);  // Ensure the ID is preserved
            LegalDocument updatedDocument = legalDocumentService.saveDocument(legalDocument);
            return new ResponseEntity<>(updatedDocument, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a legal document by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLegalDocument(@PathVariable Long id) {
        if (legalDocumentService.getDocumentById(id).isPresent()) {
            legalDocumentService.deleteDocument(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
